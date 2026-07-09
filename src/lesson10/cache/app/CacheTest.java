package lesson10.cache.app;

import lesson10.cache.core.MemoryCache;
import lesson10.cache.model.Otp;

public class CacheTest {
    public static void main(String[] args) {
        MemoryCache<Otp> otpMemoryCache = new MemoryCache<>();
        otpMemoryCache.save(new Otp("testOTP"));
        System.out.println(otpMemoryCache.get());

        otpMemoryCache.remove();
        System.out.println(otpMemoryCache.get());
    }
}
