package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes4.dex */
public final class C8366 extends C21944 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13586 f27439;

    public C8366(C13586 c13586) {
        this.f27439 = c13586;
    }

    @Override // l.InterfaceC14990
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Boolean mo22505(C14769 c14769) {
        if (c14769.m35551() < 2) {
            return Boolean.FALSE;
        }
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            InterfaceC19466 interfaceC19466 = (InterfaceC19466) it.next();
            C13586 c13586 = this.f27439;
            c13586.m33296();
            c13586.f43155.println(interfaceC19466.toString());
        }
        return Boolean.TRUE;
    }
}
