package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9660 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f31201;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f31202;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11064 f31203;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C0911 f31204;

    public C9660(C11064 c11064, String str, boolean z) {
        this.f31203 = c11064;
        this.f31201 = str;
        this.f31202 = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.֨᩸ۚ] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ?? r0 = new Runnable() { // from class: l.֨᩸ۚ
            @Override // java.lang.Runnable
            public final void run() {
                this.f5096.m8196();
            }
        };
        C11064 c11064 = this.f31203;
        c11064.f34904 = r0;
        m8199(c11064.f34898, 200);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C10186 {
        C0911 c0911M2382 = C0492.m2382(this.f31201);
        this.f31204 = c0911M2382;
        if ((c0911M2382.f3415 == EnumC20059.DIRECTORY) != this.f31202) {
            throw new IllegalArgumentException("Selected rule target type has changed");
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C11064 c11064 = this.f31203;
        if (c11064.m27972()) {
            C11064.m27959(c11064, this.f31204, true);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f31203.m27972()) {
            C22673.m51152(exc instanceof IOException ? R.string.MT_Protector : R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C11064 c11064 = this.f31203;
        c11064.f34903 = false;
        m8196();
        c11064.f34904 = null;
    }
}
