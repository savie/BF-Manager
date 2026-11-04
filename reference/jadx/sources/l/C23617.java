package l;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩹ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes.dex */
public final class C23617 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16794 f76647;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C16157 f76648;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f76649;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52855(String str, String str2) {
        this.f76649.add(C3479.m11430(str, null, AbstractC10190.m26308((C16157) null, str2)));
    }

    public C23617() {
        String string = UUID.randomUUID().toString();
        this.f76648 = C20633.f66165;
        this.f76649 = new ArrayList();
        this.f76647 = C16794.m39651(string);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52857(C16157 c16157) {
        if (c16157 == null) {
            throw new NullPointerException("type == null");
        }
        if (!c16157.m38332().equals("multipart")) {
            throw new IllegalArgumentException("multipart != " + c16157);
        }
        this.f76648 = c16157;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52856(String str, String str2, AbstractC10190 abstractC10190) {
        this.f76649.add(C3479.m11430(str, str2, abstractC10190));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20633 m52854() {
        ArrayList arrayList = this.f76649;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new C20633(this.f76647, this.f76648, arrayList);
    }
}
