<template id="">
      <div class="card btn" @click="addToCartRec" style="border-radius: 20px; margin-bottom: 1rem;">
        <div class="card-header" style=" padding-top: 1rem">
          <h6 style="font-size: 20px; font-weight: 400">{{tour_data.spec}}</h6>
        </div>
        <div class="card-body" style="border-radius: 20px">

          <div class="row">
            <div class="col-3">
              <img :src="tour_data.image" alt="" style="height: 100%; width: 100%">
            </div>
            <div class="col-3">
              <h5 class="card-text mb-5">{{tour_data.name}}</h5>
              <p>{{tour_data.street}}</p>
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
  name: "componentsListRec",
  props:{
    tour_data:{
        type: Object,
        default() {
          return {}
        }
    }
  },

  components: {
  },
  data(){
    return{

    }
  },
  methods: {
    addToCartRec() {
      this.$emit('addToCartRec' ,this.tour_data)
    }
  },
}
</script>
<style>

</style>
