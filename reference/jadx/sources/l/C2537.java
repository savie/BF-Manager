package l;

import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2537 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        if (!c12915.m31986("zip") || !c8614M31974.m23228("zip")) {
            return false;
        }
        C15102 c15102 = (C15102) c12915.m31987();
        C15102 c15103 = (C15102) c8614M31974.m23213();
        if (c15102.m36371().equals(c15103.m36371())) {
            return !c15102.m20218().equals(c15103.m20218());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970("zip");
        c8614M31974.m23174("zip");
        C15102 c15102 = (C15102) c8614M31974.m23213();
        String strM36371 = c15102.m36371();
        AbstractC22044 abstractC22044M35193 = C14584.m35193(strM36371, new String[0]);
        if (c15102.m36368()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (abstractC22044M35193.mo4303()) {
            AbstractC22044 abstractC22044M49858 = abstractC22044M35193.m49858();
            C17359.requireNonNull(abstractC22044M49858);
            if (!abstractC22044M49858.mo4303()) {
                if (!C7756.m21096()) {
                    c12915.m31979().m40400(C21576.m49059(R.string.MT_Protector, strM36371), false);
                    return;
                }
            }
        } else if (!C7756.m21096()) {
            c12915.m31979().m40400(C21576.m49059(R.string.MT_Protector, strM36371), false);
            return;
        }
        String strM43474 = c15102.m36369() ? C18685.m43474(abstractC22044M35193) : null;
        new C7758(this, c12915.m31983(), strM36371, c15102.m36369(), strM43474, c15102, c12915, strM43474).m25496();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8463(C2537 c2537, C12915 c12915, int i, C9651 c9651, boolean z) {
        C8614 c8614M31974 = c12915.m31974();
        C15102 c15102 = (C15102) c12915.m31987();
        C15102 c15103 = (C15102) c8614M31974.m23213();
        List listM31982 = c12915.m31982();
        int i2 = C13678.f43415;
        C8458 c8458 = new C8458(C9248.class);
        c8458.m22719("srcZipPath", c15102.m36371());
        c8458.m22719("tarZipPath", c15103.m36371());
        c8458.m22719("targetPath", c15103.m20218().substring(1));
        c8458.m22715(i, "update");
        c8458.m22730(listM31982);
        c8458.m22731(c12915);
        c8458.m22717(c12915.m31979(), c9651);
        c8458.m22720("keepApkSigBlock", z);
        c8458.m22714();
    }
}
