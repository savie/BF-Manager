package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.m.o.b;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11651 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C10157 f39173 = new C10157(16);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f39174;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C12274 f39175;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object f39176;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC3888());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f39174 = threadPoolExecutor;
        f39176 = new Object();
        f39175 = new C12274();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m29105(Context context, C14329 c14329, int i, C20678 c20678) {
        Handler handler;
        String str = c14329.m34586() + "-" + i;
        Typeface typeface = (Typeface) f39173.m25800(str);
        if (typeface != null) {
            c20678.m46518(new C13768(typeface));
            return typeface;
        }
        C9390 c9390 = new C9390(c20678);
        synchronized (f39176) {
            C12274 c12274 = f39175;
            ArrayList arrayList = (ArrayList) c12274.getOrDefault(str, null);
            if (arrayList != null) {
                arrayList.add(c9390);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c9390);
            c12274.put(str, arrayList2);
            CallableC3038 callableC3038 = new CallableC3038(str, context, c14329, i);
            ThreadPoolExecutor threadPoolExecutor = f39174;
            C4594 c4594 = new C4594(str);
            if (Looper.myLooper() == null) {
                handler = new Handler(Looper.getMainLooper());
            } else {
                handler = new Handler();
            }
            threadPoolExecutor.execute(new RunnableC22940(handler, callableC3038, c4594));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m29106(Context context, C14329 c14329, C20678 c20678, int i, int i2) {
        String str = c14329.m34586() + "-" + i;
        Typeface typeface = (Typeface) f39173.m25800(str);
        if (typeface != null) {
            c20678.m46518(new C13768(typeface));
            return typeface;
        }
        if (i2 == -1) {
            C13768 c13768M29107 = m29107(str, context, c14329, i);
            c20678.m46518(c13768M29107);
            return c13768M29107.f45381;
        }
        try {
            try {
                try {
                    try {
                        C13768 c13768 = (C13768) f39174.submit(new CallableC1627(str, context, c14329, i)).get(i2, TimeUnit.MILLISECONDS);
                        c20678.m46518(c13768);
                        return c13768.f45381;
                    } catch (TimeoutException unused) {
                        throw new InterruptedException(b.n0);
                    }
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        } catch (InterruptedException unused2) {
            c20678.m46518(new C13768(-3));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d A[EDGE_INSN: B:23:0x003d->B:27:0x0045 BREAK  A[LOOP:0: B:19:0x0031->B:25:0x0041]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13768 m29107(String str, Context context, C14329 c14329, int i) {
        C10157 c10157 = f39173;
        Typeface typeface = (Typeface) c10157.m25800(str);
        if (typeface != null) {
            return new C13768(typeface);
        }
        try {
            C2477 c2477M51755 = C23501.m51755(context, c14329);
            int i2 = 1;
            if (c2477M51755.m7608() != 0) {
                if (c2477M51755.m7608() != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            } else {
                C5300[] c5300ArrM7607 = c2477M51755.m7607();
                if (c5300ArrM7607 != null && c5300ArrM7607.length != 0) {
                    int length = c5300ArrM7607.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i2 = 0;
                            break;
                        }
                        int iM14694 = c5300ArrM7607[i3].m14694();
                        if (iM14694 != 0) {
                            if (iM14694 >= 0) {
                                i2 = iM14694;
                                break;
                            }
                            i2 = -3;
                            break;
                        }
                        i3++;
                    }
                }
            }
            if (i2 != 0) {
                return new C13768(i2);
            }
            Typeface typefaceM32723 = C13248.m32723(context, c2477M51755.m7607(), i);
            if (typefaceM32723 != null) {
                c10157.m25801(str, typefaceM32723);
                return new C13768(typefaceM32723);
            }
            return new C13768(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C13768(-1);
        }
    }
}
