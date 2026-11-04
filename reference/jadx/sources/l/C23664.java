package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩹ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9K8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23664 extends C24652 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f76744;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f76745;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f76746;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f76747;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC15700 f76748;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public UUID f76749;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23227 f76750;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public EnumSet f76751 = EnumSet.noneOf(EnumC17938.class);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f76752;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    @Override // l.C24652
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4684(C7453 c7453) throws C2013 {
        int iM56017;
        int iM56018;
        ?? arrayList;
        c7453.m56021(2);
        this.f76752 = c7453.m56017();
        EnumC15700 enumC15700M37473 = EnumC15700.m37473(c7453.m56017());
        this.f76748 = enumC15700M37473;
        EnumC15700 enumC15700 = EnumC15700.SMB_3_1_1;
        if (enumC15700M37473 == enumC15700) {
            iM56017 = c7453.m56017();
        } else {
            c7453.m56021(2);
            iM56017 = 0;
        }
        this.f76749 = new UUID((((c7453.m56012() << 16) | ((long) c7453.m56017())) << 16) | ((long) c7453.m56017()), AbstractC16182.f52520.mo38406(c7453));
        this.f76751 = C10961.m27792(c7453.m56012(), EnumC17938.class);
        this.f76745 = c7453.m56002();
        this.f76747 = c7453.m56002();
        this.f76744 = c7453.m56002();
        this.f76750 = C3089.m10063(c7453);
        C3089.m10063(c7453);
        int iM56019 = c7453.m56017();
        int iM560110 = c7453.m56017();
        if (this.f76748 == enumC15700) {
            iM56018 = c7453.m56017();
        } else {
            c7453.m56021(2);
            iM56018 = 0;
        }
        if (iM560110 > 0) {
            c7453.m56027(iM56019);
            c7453.m56015(iM560110);
        }
        if (this.f76748 == enumC15700) {
            c7453.m56027(iM56018);
            try {
                arrayList = new ArrayList();
                for (int i = 0; i < iM56017; i++) {
                    arrayList.add(AbstractC22194.m50201(c7453));
                }
            } catch (C2013 e) {
                throw new IllegalArgumentException("unknown error when parse negotiateContext", e);
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        this.f76746 = arrayList;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m52897() {
        return this.f76752;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC15700 m52893() {
        return this.f76748;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final UUID m52900() {
        return this.f76749;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set m52895() {
        return this.f76751;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m52901() {
        return this.f76745;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52896() {
        return this.f76747;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m52898() {
        return this.f76744;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23227 m52894() {
        return this.f76750;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m52899() {
        return this.f76746;
    }
}
