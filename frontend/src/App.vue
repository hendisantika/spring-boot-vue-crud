<template>
    <div id="main-content">
        <hello-world newlyweds="Hans &amp; Wurst" weddingdate="01.08.2018">
            <h4>Wir brauchen eure Hilfe!</h4>
            <p>Auf der Hochzeitsfeier im Ristorante möchten wir Hans &amp; Wurst dabei helfen die Gäste untereinander
                bekannt zu machen. Sie
                sollen anhand von kurzen Beschreibungen oder Fragen erraten welcher Gast oder auch welche Gäste gemeint
                sind und diese kurz vorstellen.</p>
            <p>Hierfür sind wir noch auf der Suche nach weiteren Beschreibungen und Fragen, z.B.</p>
            <question-list></question-list>
        </hello-world>
        <h4>Vielen Dank!</h4>
        <h4>Die Hochzeitsplaner</h4>
    </div>
</template>

<script>
    import HelloWorld from './components/HelloWorld.vue'
    import QuestionList from './components/QuestionList.vue'

    export default {
        name: 'app',
        components: {
            HelloWorld, QuestionList
        }
    }
</script>

<style>
    div#main-content {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 60px;
    }
</style>