package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16364 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12635 f53139;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f53140;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC20840 f53141;

    public C16364(DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840, AbstractC12635 abstractC12635, List list) {
        this.f53141 = dialogInterfaceOnDismissListenerC20840;
        this.f53139 = abstractC12635;
        this.f53140 = list;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f53141.f66729);
        this.f7780.m33188((Runnable) null);
        this.f53139.mo31414();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        char c;
        char c2;
        AbstractC12635 abstractC12635 = this.f53139;
        abstractC12635.mo31407();
        boolean zMo31401 = abstractC12635.mo31401();
        DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840 = this.f53141;
        int i = 0;
        boolean z = (zMo31401 && dialogInterfaceOnDismissListenerC20840.f66725.isChecked()) ? false : true;
        C24720 c24720M55195 = C24720.m55195();
        ArrayList arrayList = new ArrayList();
        for (C11636 c11636 : this.f53140) {
            if (c11636.f36488 != null && (z || c11636.f36482 == null)) {
                arrayList.add(c11636);
            }
        }
        int i2 = 100;
        if (abstractC12635.mo31409()) {
            BatchTranslationEngine.BatchingStrategy batchingStrategyMo31415 = abstractC12635.mo31415();
            int i3 = 0;
            while (i3 < arrayList.size() && !this.f7780.m33196()) {
                ArrayList arrayList2 = new ArrayList();
                batchingStrategyMo31415.reset();
                while (true) {
                    if (i3 < arrayList.size()) {
                        C11636 c11637 = (C11636) arrayList.get(i3);
                        String str = c11637.f36488;
                        c = 1;
                        if (!batchingStrategyMo31415.tryAdd(abstractC12635.mo31402(str, c11637.f36482))) {
                            if (arrayList2.isEmpty()) {
                                if (c24720M55195.m55199()) {
                                    C13511 c13511 = this.f7780;
                                    c2 = 2;
                                    AbstractActivityC10144 abstractActivityC10144 = dialogInterfaceOnDismissListenerC20840.f66729;
                                    Integer numValueOf = Integer.valueOf(i3 + 1);
                                    Integer numValueOf2 = Integer.valueOf(arrayList.size());
                                    String strM44060 = C18969.m44060(i2, str);
                                    Object[] objArr = new Object[3];
                                    objArr[i] = numValueOf;
                                    objArr[1] = numValueOf2;
                                    objArr[2] = strM44060;
                                    c13511.m33189(abstractActivityC10144.getString(R.string.MT_Protector, objArr));
                                } else {
                                    c2 = 2;
                                }
                                String strMo31413 = abstractC12635.mo31413(str, c11637.f36482);
                                if (!this.f7780.m33196()) {
                                    if (strMo31413 != null) {
                                        c11637.m29225(strMo31413);
                                    }
                                    i3++;
                                    break;
                                }
                                break;
                            }
                        } else {
                            arrayList2.add(c11637);
                            i3++;
                            i2 = 100;
                        }
                    } else {
                        c = 1;
                    }
                    c2 = 2;
                    break;
                }
                if (!arrayList2.isEmpty()) {
                    if (c24720M55195.m55199()) {
                        C13511 c13512 = this.f7780;
                        AbstractActivityC10144 abstractActivityC10145 = dialogInterfaceOnDismissListenerC20840.f66729;
                        Integer numValueOf3 = Integer.valueOf(i3);
                        Integer numValueOf4 = Integer.valueOf(arrayList.size());
                        String strM44061 = C18969.m44060(100, ((C11636) arrayList2.get(i)).f36488);
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = numValueOf3;
                        objArr2[c] = numValueOf4;
                        objArr2[c2] = strM44061;
                        c13512.m33189(abstractActivityC10145.getString(R.string.MT_Protector, objArr2));
                    }
                    String[] strArr = new String[arrayList2.size()];
                    String[] strArr2 = new String[arrayList2.size()];
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        C11636 c11638 = (C11636) arrayList2.get(i4);
                        strArr[i4] = c11638.f36488;
                        strArr2[i4] = c11638.f36482;
                    }
                    String[] strArrMo31406 = abstractC12635.mo31406(strArr, strArr2);
                    if (this.f7780.m33196()) {
                        break;
                    }
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        if (strArrMo31406[i5] != null) {
                            ((C11636) arrayList2.get(i5)).m29225(strArrMo31406[i5]);
                        }
                    }
                }
                i = 0;
                i2 = 100;
                batchingStrategyMo31415 = batchingStrategyMo31415;
            }
        } else {
            for (int i6 = 0; i6 < arrayList.size() && !this.f7780.m33196(); i6++) {
                C11636 c11639 = (C11636) arrayList.get(i6);
                if (c24720M55195.m55199()) {
                    this.f7780.m33189(dialogInterfaceOnDismissListenerC20840.f66729.getString(R.string.MT_Protector, Integer.valueOf(i6 + 1), Integer.valueOf(arrayList.size()), C18969.m44060(100, c11639.f36488)));
                }
                String strMo31414 = abstractC12635.mo31413(c11639.f36488, c11639.f36482);
                if (this.f7780.m33196()) {
                    break;
                }
                if (strMo31414 != null) {
                    c11639.m29225(strMo31414);
                }
            }
        }
        abstractC12635.mo31411();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7780.m33196()) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
        this.f53141.f66729.m26244();
        this.f53139.mo31403();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        boolean zM33196 = this.f7780.m33196();
        DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840 = this.f53141;
        if (zM33196) {
            C22673.m51152(R.string.MT_Protector);
        } else if (!this.f53139.mo31405(exc)) {
            dialogInterfaceOnDismissListenerC20840.f66729.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
        dialogInterfaceOnDismissListenerC20840.f66729.m26244();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f53141.f66729.m26255();
        this.f7780.m33185();
    }
}
