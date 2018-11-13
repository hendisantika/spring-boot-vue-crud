<template>
    <ul>
        <li>Who is the biggest one?</li>
        <li>These guests come over when it gets a bit too hot</li>
        <li>With which guest did you experience XY?</li>
        <li>You were with her on Rome in 2018</li>
        <li>He is "the Viking"</li>
        <li v-for="(question) in questions" :key="question.id">
            {{ question.question }}
        </li>
        <li>
            <input id="question-input" type="text" name="question" placeholder="Enter your description / question here"
                   style=""/>
            <button type="button" @click="saveQuestion">Enter</button>
        </li>
    </ul>
</template>

<script>
    import axios from 'axios'

    export default {
        name: 'QuestionList',
        data: function () {
            this.loadQuestions();
            return {
                questions: []
            };
        },
        methods: {
            loadQuestions: function () {
                const self = this;
                axios.get('/api/questions')
                    .then(function (response) {
                        self.questions = response.data._embedded.questions;
                    })
                    .catch(function (error) {
                        console.log(error);
                    });
            },
            saveQuestion: function () {
                const self = this;
                const questionInput = document.getElementById("question-input");
                if (questionInput.value) {
                    axios.post('/api/questions', {
                        question: questionInput.value
                    })
                        .then(function (response) {
                            questionInput.value = "";
                            self.questions.push(response.data);
                        })
                        .catch(function (error) {
                            console.log(error);
                        });
                }
            }
        }
    }
</script>

<style type="text/css">
    input {
        width: 300px;
        border: 0;
        border-bottom: 1px solid gray;
        font-size: 12pt;
        margin: 0 5px 0 0;
    }
</style>