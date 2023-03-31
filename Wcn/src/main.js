import { createApp } from 'vue'
import router from '@/router'
import './style.css'
import App from './App.vue'
import { Button } from 'vant'
import 'lib-flexible/flexible'
import '@/common/style/theme.css'


//createApp(App).mount('#app')

/*
// 初始化VUe实例
const app = createApp(App)
// 注册路由
app.use(router)
//挂载Vue实例
app.mount('#app')
*/
// 初始化 Vue 实例
const app = createApp(App)
// 注册路由
app.use(router)
app.use(Button)
// 挂载 Vue 实例
app.mount('#app')
