import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import { fileURLToPath, URL } from 'node:url'
import Components from 'unplugin-vue-components/vite'
import { VantResolver } from 'unplugin-vue-components/resolvers'

// https://vitejs.dev/config/
export default defineConfig({
  // 修改端口号
  server: {
    port: 8084
  },
  plugins: [
    vue(),
    Components({ resolvers: [VantResolver()]})
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src',import.meta.url))
    }
  }
})
