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

/* JADX INFO: renamed from: l.ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5293 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f18627;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C9086 f18628;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object f18629;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C0884 f18630 = new C0884(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC15733());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f18627 = threadPoolExecutor;
        f18629 = new Object();
        f18628 = new C9086();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m15887(Context context, C21701 c21701, int i, C7792 c7792) {
        Handler handler;
        String str = c21701.m49264() + "-" + i;
        Typeface typeface = (Typeface) f18630.m3588(str);
        if (typeface != null) {
            c7792.m21186(new C12750(typeface));
            return typeface;
        }
        C22447 c22447 = new C22447(c7792);
        synchronized (f18629) {
            C9086 c9086 = f18628;
            ArrayList arrayList = (ArrayList) c9086.get(str);
            if (arrayList != null) {
                arrayList.add(c22447);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c22447);
            c9086.put(str, arrayList2);
            CallableC19463 callableC19463 = new CallableC19463(str, context, c21701, i);
            ThreadPoolExecutor threadPoolExecutor = f18627;
            C14987 c14987 = new C14987(str);
            if (Looper.myLooper() == null) {
                handler = new Handler(Looper.getMainLooper());
            } else {
                handler = new Handler();
            }
            threadPoolExecutor.execute(new RunnableC3055(handler, callableC19463, c14987));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m15888(Context context, C21701 c21701, C7792 c7792, int i, int i2) {
        String str = c21701.m49264() + "-" + i;
        Typeface typeface = (Typeface) f18630.m3588(str);
        if (typeface != null) {
            c7792.m21186(new C12750(typeface));
            return typeface;
        }
        if (i2 == -1) {
            C12750 c12750M15889 = m15889(str, context, c21701, i);
            c7792.m21186(c12750M15889);
            return c12750M15889.f40816;
        }
        try {
            try {
                try {
                    try {
                        C12750 c12750 = (C12750) f18627.submit(new CallableC10512(str, context, c21701, i)).get(i2, TimeUnit.MILLISECONDS);
                        c7792.m21186(c12750);
                        return c12750.f40816;
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
            c7792.m21186(new C12750(-3));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d A[EDGE_INSN: B:23:0x003d->B:27:0x0045 BREAK  A[LOOP:0: B:19:0x0031->B:25:0x0041]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12750 m15889(String str, Context context, C21701 c21701, int i) {
        C0884 c0884 = f18630;
        Typeface typeface = (Typeface) c0884.m3588(str);
        if (typeface != null) {
            return new C12750(typeface);
        }
        try {
            C1564 c1564M14288 = C4547.m14288(context, c21701);
            int i2 = 1;
            if (c1564M14288.m5523() != 0) {
                if (c1564M14288.m5523() != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            } else {
                C11258[] c11258ArrM5522 = c1564M14288.m5522();
                if (c11258ArrM5522 != null && c11258ArrM5522.length != 0) {
                    int length = c11258ArrM5522.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i2 = 0;
                            break;
                        }
                        int iM28498 = c11258ArrM5522[i3].m28498();
                        if (iM28498 != 0) {
                            if (iM28498 >= 0) {
                                i2 = iM28498;
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
                return new C12750(i2);
            }
            Typeface typefaceM41562 = C17750.m41562(context, c1564M14288.m5522(), i);
            if (typefaceM41562 != null) {
                c0884.m3589(str, typefaceM41562);
                return new C12750(typefaceM41562);
            }
            return new C12750(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C12750(-1);
        }
    }
}
