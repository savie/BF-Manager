package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.֫ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9K8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1892 extends C11771 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f7138;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f7139;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumSet f7140 = EnumSet.noneOf(EnumC24036.class);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f7141;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f7142;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public UUID f7143;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1644 f7144;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC20508 f7145;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f7146;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    @Override // l.C11771
    /* JADX INFO: renamed from: ܰ */
    public final void mo2356(C19240 c19240) throws C17271 {
        int iM27375;
        int iM27376;
        ?? arrayList;
        c19240.m27389(2);
        this.f7146 = c19240.m27375();
        EnumC20508 enumC20508M46303 = EnumC20508.m46303(c19240.m27375());
        this.f7145 = enumC20508M46303;
        EnumC20508 enumC20508 = EnumC20508.SMB_3_1_1;
        if (enumC20508M46303 == enumC20508) {
            iM27375 = c19240.m27375();
        } else {
            c19240.m27389(2);
            iM27375 = 0;
        }
        this.f7143 = new UUID((((c19240.m27394() << 16) | ((long) c19240.m27375())) << 16) | ((long) c19240.m27375()), AbstractC1748.f6871.mo5790(c19240));
        this.f7140 = C20799.m46782(c19240.m27394(), EnumC24036.class);
        this.f7142 = c19240.m27378();
        this.f7138 = c19240.m27378();
        this.f7139 = c19240.m27378();
        this.f7144 = C9407.m24150(c19240);
        C9407.m24150(c19240);
        int iM27377 = c19240.m27375();
        int iM27378 = c19240.m27375();
        if (this.f7145 == enumC20508) {
            iM27376 = c19240.m27375();
        } else {
            c19240.m27389(2);
            iM27376 = 0;
        }
        if (iM27378 > 0) {
            c19240.m27376(iM27377);
            c19240.m27393(iM27378);
        }
        if (this.f7145 == enumC20508) {
            c19240.m27376(iM27376);
            try {
                arrayList = new ArrayList();
                for (int i = 0; i < iM27375; i++) {
                    arrayList.add(AbstractC9988.m25244(c19240));
                }
            } catch (C17271 e) {
                throw new IllegalArgumentException("unknown error when parse negotiateContext", e);
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        this.f7141 = arrayList;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m6156() {
        return this.f7146;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC20508 m6151() {
        return this.f7145;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final UUID m6157() {
        return this.f7143;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Set m6154() {
        return this.f7140;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m6159() {
        return this.f7142;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m6152() {
        return this.f7138;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m6155() {
        return this.f7139;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C1644 m6153() {
        return this.f7144;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m6158() {
        return this.f7141;
    }
}
