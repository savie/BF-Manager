package l;

import java.lang.ref.SoftReference;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۢܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10267 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f32799;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f32800;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m26474() {
        Object obj;
        Object[] objArr = this.f32799;
        int i = this.f32800;
        obj = objArr[i];
        objArr[i] = null;
        this.f32800 = (i - 1) & SecP521R1Field.P16;
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26475(SoftReference softReference) {
        int i = (this.f32800 + 1) & SecP521R1Field.P16;
        this.f32800 = i;
        this.f32799[i] = softReference;
    }

    public C10267() {
        this.f32799 = new Object[512];
        this.f32800 = 0;
    }

    public /* synthetic */ C10267(int i) {
        this();
    }
}
