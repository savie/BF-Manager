package l;

import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۨ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12029 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f40283;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f40288 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public UUID f40287 = C1297.f5562;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8015 f40284 = C2584.f10160;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f40282 = new int[0];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f40285 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1619 f40286 = new C1619();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f40289 = 300000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29926(UUID uuid) {
        uuid.getClass();
        this.f40287 = uuid;
        this.f40284 = C2584.f10160;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29927(boolean z) {
        this.f40283 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29928(int... iArr) {
        for (int i : iArr) {
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            C2023.m6507(z);
        }
        this.f40282 = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29929(boolean z) {
        this.f40285 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21906 m29925(C5407 c5407) {
        return new C21906(this.f40287, this.f40284, c5407, this.f40288, this.f40283, this.f40282, this.f40285, this.f40286, this.f40289);
    }
}
