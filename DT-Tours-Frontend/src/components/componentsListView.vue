<template id="">


      <div class="card" @click="addToCartView" style="border-radius: 20px;">
        <div class="card-header" style="text-align: center; padding-top: 1rem; ">
          <h6 style="font-size: 20px; font-weight: 400">{{tourView_data.spec}}</h6>
        </div>
        <div class="card-body" style="border-radius: 20px">

          <div class="row">
            <div class="col-3">
              <img :src="tourView_data.image" alt="" style="height: 100%; width:100%">
            </div>
            <div class="col-3">
              <h5 class="card-text">{{tourView_data.name}}</h5>
            </div>
            <div class="col-5">
              <a href="#" class="btn btn-primary mx-1 my-1">#Кемпинг</a>
              <a href="#" class="btn btn-primary mx-1 my-1">#Горы</a>
              <a href="#" class="btn btn-primary mx-1 my-1">#Атмосфера</a>
              <a href="#" class="btn btn-primary mx-1 my-1">#ПодОткрытымНебом</a>
              <a href="#" class="btn btn-primary mx-1 my-1">#Поход</a>
            </div>
            <div class="col-1">

            </div>
          </div>

        </div>
      </div>


</template>
<script>

export default {
  name: "componentsListView",

  components: {
  },
  props:{
    tourView_data:{
        type: Object,
        default() {
          return {}
        }
    }
  },
  data(){
    return{

    }
  },
  methods: {
    addToCartView(){
      console.log(this.tourView_data)
    }
  },
}
</script>
<style>

</style>
