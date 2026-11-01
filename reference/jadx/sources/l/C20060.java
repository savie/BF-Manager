package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.᩶ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8SE */
/* JADX INFO: loaded from: classes4.dex */
public final class C20060 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f64203;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20765 f64204;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f64205;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11593 f64206;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f64207;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f64208;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f64209;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f64210;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f64211;

    public C20060(Looper looper, InterfaceC11593 interfaceC11593, InterfaceC20765 interfaceC20765) {
        this(new CopyOnWriteArraySet(), looper, interfaceC11593, interfaceC20765, true);
    }

    public C20060(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC11593 interfaceC11593, InterfaceC20765 interfaceC20765, boolean z) {
        this.f64206 = interfaceC11593;
        this.f64207 = copyOnWriteArraySet;
        this.f64204 = interfaceC20765;
        this.f64209 = new Object();
        this.f64210 = new ArrayDeque();
        this.f64211 = new ArrayDeque();
        this.f64208 = interfaceC11593.mo28887(looper, new Handler.Callback() { // from class: l.ۡۡۙ
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C20060.m45421(this.f30185);
                return true;
            }
        });
        this.f64205 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45426(Object obj) {
        obj.getClass();
        synchronized (this.f64209) {
            if (this.f64203) {
                return;
            }
            this.f64207.add(new C15827(obj));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20060 m45423(Looper looper, C5623 c5623) {
        return new C20060(this.f64207, looper, this.f64206, c5623, this.f64205);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45427(InterfaceC19333 interfaceC19333) {
        m45422();
        CopyOnWriteArraySet<C15827> copyOnWriteArraySet = this.f64207;
        for (C15827 c15827 : copyOnWriteArraySet) {
            if (c15827.f51230.equals(interfaceC19333)) {
                c15827.m37610(this.f64204);
                copyOnWriteArraySet.remove(c15827);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45425(final int i, final InterfaceC7359 interfaceC7359) {
        m45422();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f64207);
        this.f64211.add(new Runnable() { // from class: l.ۤۡۙ
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((C15827) it.next()).m37608(i, interfaceC7359);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45424() {
        m45422();
        ArrayDeque arrayDeque = this.f64211;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC8065 interfaceC8065 = this.f64208;
        if (!interfaceC8065.mo21241()) {
            interfaceC8065.mo21244(interfaceC8065.mo21237(1));
        }
        ArrayDeque arrayDeque2 = this.f64210;
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45429(int i, InterfaceC7359 interfaceC7359) {
        m45425(i, interfaceC7359);
        m45424();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45428() {
        m45422();
        synchronized (this.f64209) {
            this.f64203 = true;
        }
        Iterator it = this.f64207.iterator();
        while (it.hasNext()) {
            ((C15827) it.next()).m37610(this.f64204);
        }
        this.f64207.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45421(C20060 c20060) {
        Iterator it = c20060.f64207.iterator();
        while (it.hasNext()) {
            ((C15827) it.next()).m37609(c20060.f64204);
            if (c20060.f64208.mo21241()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m45422() {
        if (this.f64205) {
            C2023.m6510(Thread.currentThread() == this.f64208.mo21245().getThread());
        }
    }
}
