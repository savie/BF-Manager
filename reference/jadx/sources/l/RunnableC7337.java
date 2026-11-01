package l;

import android.os.Bundle;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7337 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24378;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24379;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24380;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24381;

    public /* synthetic */ RunnableC7337(Object obj, Object obj2, Object obj3, int i) {
        this.f24379 = i;
        this.f24381 = obj;
        this.f24378 = obj2;
        this.f24380 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24379;
        Object obj = this.f24380;
        Object obj2 = this.f24378;
        Object obj3 = this.f24381;
        switch (i) {
            case 0:
                C17485 c17485 = (C17485) obj3;
                ViewOnClickListenerC8374 viewOnClickListenerC8374 = (ViewOnClickListenerC8374) obj2;
                Bundle bundle = (Bundle) obj;
                int i2 = ViewOnClickListenerC8374.f29048;
                try {
                    C6696.m18104();
                    C16737.m39273(new RunnableC22610(c17485, viewOnClickListenerC8374, bundle, 2));
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            default:
                ((DialogInterfaceC19356) obj3).dismiss();
                ((C5964) obj2).n((C3825) obj);
                return;
        }
    }
}
