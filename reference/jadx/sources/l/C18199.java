package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18199 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("local") && c12915.m31974().m23228("zip");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970("local");
        c8614M31974.m23174("zip");
        C15102 c15102 = (C15102) c8614M31974.m23213();
        if (c15102.m36368()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        String strM36371 = c15102.m36371();
        AbstractC22044 abstractC22044M35193 = C14584.m35193(strM36371, new String[0]);
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
        new C6267(this, c12915.m31983(), strM36371, c15102.m36369(), strM43474, c12915, c15102, strM43474, abstractC22044M35193).m25491(c12915.m31981());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42353(C18199 c18199, C12915 c12915, AbstractC22044 abstractC22044, int i, int i2, boolean z, String str, C9651 c9651, boolean z2) {
        int i3 = C13678.f43415;
        C8458 c8458 = new C8458(C21183.class);
        c8458.m22719("zipPath", abstractC22044.mo4294());
        c8458.m22719("rename", str);
        c8458.m22731(c12915);
        c8458.m22723(c12915.m31982());
        c8458.m22715(i, "level");
        c8458.m22715(i2, "update");
        c8458.m22720("deleteSources", z);
        c8458.m22719("basePath", c12915.m31974().m23166().substring(1));
        c8458.m22717(c12915.m31979(), c9651);
        c8458.m22720("keepApkSigBlock", z2);
        c8458.m22714();
    }
}
