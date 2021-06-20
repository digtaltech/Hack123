<template id="">

      <div class="card mx-5 my-2" style="border-radius: 15px;  padding: 10px">
        <div class="row" style="height: 45px;">
          <div class="col mx-3">
            <h6 class="mt-2 mx-2" style="font-size: 19px; font-weight: 500">{{cartList_data.name}}</h6>
          </div>
          <div class="col mx-3" style="text-align: right;">
            <p class="mt-2 mx-2" style="color:#95AAC9; font-size: 19px;">{{cartList_data.time}}</p>
          </div>
        </div>
      </div>

</template>
<script>
import {mapGetters} from 'vuex'

export default {
  name: "componentsCartList",

  components: {
  },
  props:{
    cartList_data:{
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
  computed: {
    ...mapGetters([
      'CART_LIST'
    ]),
  },
  methods: {

  },
}
</script>
<style>

</style>
