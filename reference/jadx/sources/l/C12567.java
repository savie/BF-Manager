package l;

import java.util.ArrayDeque;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 96FJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12567 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f40358 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20772 f40357 = new C20772();

    static {
        C16980.m40037(C12567.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31276(AbstractC20255 abstractC20255) {
        C20772 c20772 = this.f40357;
        ArrayDeque arrayDeque = this.f40358;
        arrayDeque.push(c20772);
        if (arrayDeque.size() > 1000) {
            throw new C2631("Regions stack size limit reached");
        }
        this.f40357 = this.f40357.m47522(abstractC20255);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31282() {
        this.f40357 = (C20772) this.f40358.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31277(C21943 c21943) {
        if (c21943 != null) {
            this.f40357.f66552.add(c21943);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m31279(C21943 c21943) {
        if (c21943 != null) {
            this.f40357.f66552.remove(c21943);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m31281(C21943 c21943) {
        return this.f40357.f66552.contains(c21943);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set m31280() {
        return this.f40357.f66552;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18213 m31278() {
        return this.f40357.f66553;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31275() {
        this.f40358.clear();
        this.f40357 = new C20772();
    }

    public final String toString() {
        return "Region stack size: " + this.f40358.size() + ", last: " + this.f40357;
    }
}
