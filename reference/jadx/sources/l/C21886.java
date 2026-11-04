package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E1YX */
/* JADX INFO: loaded from: classes.dex */
public final class C21886 extends AbstractC9843 {
    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        c12915.m31970("zip");
        final C15102 c15102 = (C15102) c12915.m31987();
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
        final String strM43474 = c15102.m36369() ? C18685.m43474(abstractC22044M35193) : null;
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(AbstractC9843.m25619(c12915));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠۠۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C21886.m49576(this.f27805, c15102, c12915, strM43474);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (c15102.m36369()) {
            C8614 c8614M31983 = c12915.m31983();
            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            C0938.m3745(c8614M31983, c2361BuildDialog.m8016(), strM43474);
            return;
        }
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49576(final C21886 c21886, C15102 c15102, final C12915 c12915, String str) {
        if (c15102.m36369()) {
            C0938.m3749(new InterfaceC18837(c21886) { // from class: l.ۜ۠۫
                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ void mo1268() {
                }

                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final void mo1269(C9651 c9651, boolean z) {
                    C21886.m49577(c12915, c9651, z);
                }

                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ boolean mo1270(Exception exc) {
                    return false;
                }
            }, c12915.m31979(), str);
        } else {
            m49577(c12915, null, false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49577(C12915 c12915, C9651 c9651, boolean z) {
        C15102 c15102 = (C15102) c12915.m31987();
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C4732.class);
        c8458.m22730(c12915.m31982());
        c8458.m22719("zipPath", c15102.m36371());
        c8458.m22728(c12915);
        c8458.m22717(c12915.m31979(), c9651);
        c8458.m22720("keepApkSigBlock", z);
        c8458.m22714();
    }
}
