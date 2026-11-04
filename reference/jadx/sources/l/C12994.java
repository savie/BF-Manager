package l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.۫ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12994 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f41643;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f41644;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8402 f41645;

    public C12994() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C12994(CopyOnWriteArrayList copyOnWriteArrayList, int i, C8402 c8402) {
        this.f41643 = copyOnWriteArrayList;
        this.f41644 = i;
        this.f41645 = c8402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12994 m32406(int i, C8402 c8402) {
        return new C12994(this.f41643, i, c8402);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32411(InterfaceC5537 interfaceC5537) {
        CopyOnWriteArrayList<C15231> copyOnWriteArrayList = this.f41643;
        for (C15231 c15231 : copyOnWriteArrayList) {
            if (c15231.f49700 == interfaceC5537) {
                copyOnWriteArrayList.remove(c15231);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32409(Handler handler, InterfaceC5537 interfaceC5537) {
        handler.getClass();
        C15231 c15231 = new C15231();
        c15231.f49699 = handler;
        c15231.f49700 = interfaceC5537;
        this.f41643.add(c15231);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ۚۡۙ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32408(final int i) {
        for (C15231 c15231 : this.f41643) {
            final ?? r2 = c15231.f49700;
            C7116.m19483(c15231.f49699, new Runnable() { // from class: l.᩸ۡۙ
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ۚۡۙ] */
                @Override // java.lang.Runnable
                public final void run() {
                    C12994 c12994 = this.f73669;
                    r2.mo7205(c12994.f41644, c12994.f41645, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32407() {
        for (C15231 c15231 : this.f41643) {
            C7116.m19483(c15231.f49699, new RunnableC9840(1, this, c15231.f49700));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32410(Exception exc) {
        for (C15231 c15231 : this.f41643) {
            C7116.m19483(c15231.f49699, new RunnableC25066(this, c15231.f49700, exc, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ۚۡۙ] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32413() {
        for (C15231 c15231 : this.f41643) {
            final ?? r2 = c15231.f49700;
            C7116.m19483(c15231.f49699, new Runnable() { // from class: l.ᩴۡۙ
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ۚۡۙ] */
                @Override // java.lang.Runnable
                public final void run() {
                    C12994 c12994 = this.f63442;
                    r2.mo7249(c12994.f41644, c12994.f41645);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32412() {
        for (C15231 c15231 : this.f41643) {
            C7116.m19483(c15231.f49699, new RunnableC8498(1, this, c15231.f49700));
        }
    }
}
