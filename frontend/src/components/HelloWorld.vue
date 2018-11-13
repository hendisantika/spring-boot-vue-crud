<template>
    <div class="hello">
        <h1>Hochzeit von {{ newlyweds }}</h1>
        <h2>{{ weddingdate }}</h2>
        <slot></slot>
    </div>
</template>

<script>
    export default {
        name: 'HelloWorld',
        props: {
            newlyweds: String,
            weddingdate: String
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    h3 {
        margin: 40px 0 0;
    }

    ul {
        text-align: left;
    }

    a {
        color: #42b983;
    }
</style>
