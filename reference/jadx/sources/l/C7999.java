package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 795C */
/* JADX INFO: loaded from: classes4.dex */
public final class C7999 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        if (!c12915.m31986("local")) {
            return false;
        }
        C8614 c8614M31974 = c12915.m31974();
        if (c12915.m31986("local")) {
            return c12915.m31981() == 1 || !(!c8614M31974.m23228("local") || c8614M31974.m23197() || c12915.m31976().equals(c8614M31974.m23192()));
        }
        return false;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c12915.m31970("local");
        if (c12915.m31981() != 1) {
            c8614M31974.m23174("local");
            m25620(c12915, R.string.MT_Protector, AbstractC9843.m25618(c12915, R.string.MT_Protector));
            return;
        }
        AbstractC22044 abstractC22044Mo8093 = c12915.m31989().mo8093();
        View viewM40395 = c12915.m31979().m40395(R.layout.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        final C23255 c23257 = (C23255) viewM40395.findViewById(R.id.editText3);
        final C1626 c1626 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        C1626 c1627 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        C7893.m21433(c1626);
        final C8614 c8614M31975 = c12915.m31974();
        if (!c8614M31975.m23228("local") || c8614M31975.m23197() || c12915.m31976().equals(c8614M31975.m23192())) {
            c23255.mo52335((CharSequence) (abstractC22044Mo8093.m49874() + "-link" + abstractC22044Mo8093.m49864()));
            c23256.mo52335((CharSequence) c12915.m31978());
        } else {
            c23255.mo52335((CharSequence) abstractC22044Mo8093.getName());
            c23256.mo52335((CharSequence) c8614M31975.m23166());
            c1627.m5767(-1);
            c1627.m5757(R.drawable.MT_Protector);
            c1627.m5759(new View.OnClickListener() { // from class: l.ܰܺ۫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C12915 c12916 = c12915;
                    AbstractC22044 abstractC22044M35193 = C14584.m35193(c12916.m31978(), new String[0]);
                    String name = abstractC22044M35193.getName();
                    if (name.isEmpty()) {
                        name = C21576.m49088(R.string.MT_Protector);
                    }
                    if (c12916.m31983().m23195()) {
                        arrayList2.add(C21576.m49059(R.string.MT_Protector, name));
                    } else {
                        arrayList2.add(C21576.m49059(R.string.MT_Protector, name));
                    }
                    arrayList.add(abstractC22044M35193);
                    C8614 c8614 = c8614M31975;
                    AbstractC22044 abstractC22044M35194 = C14584.m35193(c8614.m23166(), new String[0]);
                    String name2 = abstractC22044M35194.getName();
                    if (name2.isEmpty()) {
                        name2 = C21576.m49088(R.string.MT_Protector);
                    }
                    if (c8614.m23195()) {
                        arrayList2.add(0, C21576.m49059(R.string.MT_Protector, name2));
                        arrayList.add(0, abstractC22044M35194);
                    } else {
                        arrayList2.add(C21576.m49059(R.string.MT_Protector, name2));
                        arrayList.add(abstractC22044M35194);
                    }
                    C2361 c2361BuildDialog = c12916.m31979().buildDialog();
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new String[0]);
                    final C23255 c23258 = c23256;
                    c2361BuildDialog.m8014(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.ܿܺ۫
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            String strMo4294 = ((AbstractC22044) arrayList.get(i)).mo4294();
                            C23255 c23259 = c23258;
                            c23259.mo52335((CharSequence) strMo4294);
                            c23259.mo52339(c23259.m54099());
                        }
                    });
                    c2361BuildDialog.m8016();
                }
            });
        }
        c23257.mo52335((CharSequence) abstractC22044Mo8093.mo2951());
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.᩶ܺ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M34866;
                C8614 c8614 = c8614M31975;
                C12915 c12916 = c12915;
                String string = c23255.m54021().toString();
                String string2 = c23256.m54021().toString();
                String string3 = c23257.m54021().toString();
                AbstractC22044 abstractC22044M35193 = C14584.m35193(C11293.m28549(string2, string), new String[0]);
                if (abstractC22044M35193.mo2934()) {
                    c1626.m5768(C21576.m49088(R.string.MT_Protector));
                    return;
                }
                try {
                    abstractC22044M35193.mo49834();
                    abstractC22044M35193.mo2946(string3);
                    dialogInterfaceC8327.dismiss();
                    if (c8614.m23228("local") && !c8614.m23197() && string2.equals(c8614.m23166())) {
                        c8614.m23230(abstractC22044M35193.getName());
                        c8614.m23216();
                    } else {
                        c12916.m31983().m23230(abstractC22044M35193.getName());
                        c12916.m31983().m23226(string2, true);
                    }
                    C6331.m18055();
                    dialogInterfaceC8327.dismiss();
                } catch (IOException e) {
                    c12916.m31979().m40401(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        c8614M31974.m23174("local");
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C0541.class);
        c8458.m22723(c12915.m31982());
        c8458.m22731(c12915);
        c8458.m22719("targetPath", c8614M31974.m23166());
        c8458.m22714();
    }
}
