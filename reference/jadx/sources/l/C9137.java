package l;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.alipay.sdk.m.u0.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۡۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAN9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9137 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Activity f29698;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14115 f29700;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f29699 = new ReentrantLock();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f29697 = new LinkedHashSet();

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24278(InterfaceC0818 interfaceC0818) {
        C15243.m36590(interfaceC0818, MessageHandler.Properties.Listener);
        ReentrantLock reentrantLock = this.f29699;
        reentrantLock.lock();
        try {
            this.f29697.remove(interfaceC0818);
        } finally {
            reentrantLock.unlock();
        }
    }

    public C9137(Activity activity) {
        this.f29698 = activity;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        C15243.m36590(windowLayoutInfo, b.d);
        ReentrantLock reentrantLock = this.f29699;
        reentrantLock.lock();
        try {
            this.f29700 = C8392.m22556(this.f29698, windowLayoutInfo);
            Iterator it = this.f29697.iterator();
            while (it.hasNext()) {
                ((InterfaceC0818) it.next()).accept(this.f29700);
            }
            C11471 c11471 = C11471.f36082;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24279(C2929 c2929) {
        ReentrantLock reentrantLock = this.f29699;
        reentrantLock.lock();
        try {
            C14115 c14115 = this.f29700;
            if (c14115 != null) {
                c2929.accept(c14115);
            }
            this.f29697.add(c2929);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24280() {
        return this.f29697.isEmpty();
    }
}
