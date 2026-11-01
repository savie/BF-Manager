package l;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۗۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3149 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14511 f11879;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9501 f11880;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11881;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9542(String str, String str2) {
        this.f11881.add(C4373.m12226(str, null, AbstractC21307.m47776((C9501) null, str2)));
    }

    public C3149() {
        String string = UUID.randomUUID().toString();
        this.f11880 = C13547.f44709;
        this.f11881 = new ArrayList();
        this.f11879 = C14511.m34934(string);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9544(C9501 c9501) {
        if (c9501 == null) {
            throw new NullPointerException("type == null");
        }
        if (!c9501.m24337().equals("multipart")) {
            throw new IllegalArgumentException("multipart != " + c9501);
        }
        this.f11880 = c9501;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9543(String str, String str2, AbstractC21307 abstractC21307) {
        this.f11881.add(C4373.m12226(str, str2, abstractC21307));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13547 m9541() {
        ArrayList arrayList = this.f11881;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new C13547(this.f11879, this.f11880, arrayList);
    }
}
