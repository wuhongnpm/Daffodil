import { createApp } from 'vue'
import router from '@/router'
import './style.css'
import App from './App.vue'
import 'lib-flexible/flexible'
// 初始化 Vue 实例
const app = createApp(App)
// 注册路由
app.use(router)
// 挂载 Vue 实例
app.mount('#app')

//引入全局样式
import "./common/style/mixin.less"