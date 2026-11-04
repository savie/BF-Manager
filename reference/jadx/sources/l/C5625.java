package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.ۚۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8SE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5625 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f19455;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14814 f19456;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f19457;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f19458;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f19459;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f19460;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f19461;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f19462;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC15319 f19463;

    public C5625(Looper looper, InterfaceC14814 interfaceC14814, InterfaceC15319 interfaceC15319) {
        this(new CopyOnWriteArraySet(), looper, interfaceC14814, interfaceC15319, true);
    }

    public C5625(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC14814 interfaceC14814, InterfaceC15319 interfaceC15319, boolean z) {
        this.f19456 = interfaceC14814;
        this.f19461 = copyOnWriteArraySet;
        this.f19463 = interfaceC15319;
        this.f19457 = new Object();
        this.f19462 = new ArrayDeque();
        this.f19460 = new ArrayDeque();
        this.f19458 = interfaceC14814.mo2209(looper, new Handler.Callback() { // from class: l.ۤۨۙ
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C5625.m16600(this.f34341);
                return true;
            }
        });
        this.f19455 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16605(Object obj) {
        obj.getClass();
        synchronized (this.f19457) {
            if (this.f19459) {
                return;
            }
            this.f19461.add(new C13082(obj));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5625 m16602(Looper looper, C3963 c3963) {
        return new C5625(this.f19461, looper, this.f19456, c3963, this.f19455);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16606(InterfaceC10582 interfaceC10582) {
        m16601();
        CopyOnWriteArraySet<C13082> copyOnWriteArraySet = this.f19461;
        for (C13082 c13082 : copyOnWriteArraySet) {
            if (c13082.f41826.equals(interfaceC10582)) {
                c13082.m32556(this.f19463);
                copyOnWriteArraySet.remove(c13082);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16604(final int i, final InterfaceC19795 interfaceC19795) {
        m16601();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f19461);
        this.f19460.add(new Runnable() { // from class: l.᩸ۨۙ
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((C13082) it.next()).m32554(i, interfaceC19795);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16603() {
        m16601();
        ArrayDeque arrayDeque = this.f19460;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC4879 interfaceC4879 = this.f19458;
        if (!interfaceC4879.mo14964()) {
            interfaceC4879.mo14967(interfaceC4879.mo14960(1));
        }
        ArrayDeque arrayDeque2 = this.f19462;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16608(int i, InterfaceC19795 interfaceC19795) {
        m16604(i, interfaceC19795);
        m16603();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16607() {
        m16601();
        synchronized (this.f19457) {
            this.f19459 = true;
        }
        Iterator it = this.f19461.iterator();
        while (it.hasNext()) {
            ((C13082) it.next()).m32556(this.f19463);
        }
        this.f19461.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16600(C5625 c5625) {
        Iterator it = c5625.f19461.iterator();
        while (it.hasNext()) {
            ((C13082) it.next()).m32555(c5625.f19463);
            if (c5625.f19458.mo14964()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m16601() {
        if (this.f19455) {
            C20782.m47568(Thread.currentThread() == this.f19458.mo14968().getThread());
        }
    }
}
