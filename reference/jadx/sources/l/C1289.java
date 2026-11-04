package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9GX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1289 extends C24652 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f4603;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumSet f4604;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumSet f4605;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public EnumSet f4606;

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4684(C7453 c7453) throws C2013 {
        c7453.m56021(2);
        this.f4603 = c7453.m56020();
        c7453.m56020();
        this.f4604 = C10961.m27792(c7453.m56012(), EnumC19430.class);
        this.f4606 = C10961.m27792(c7453.m56012(), EnumC8243.class);
        this.f4605 = C10961.m27792(c7453.m56012(), EnumC15767.class);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m4685() {
        return this.f4603 == 1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m4682() {
        return this.f4603 == 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m4683() {
        return this.f4603 == 3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumSet m4681() {
        return this.f4604;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set m4680() {
        return this.f4606;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet m4679() {
        return this.f4605;
    }
}
