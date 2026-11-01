package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18790 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f60911;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC10324 f60912;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC8913 f60913;

    public C18790(DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913, AbstractC10324 abstractC10324, List list) {
        this.f60913 = dialogInterfaceOnDismissListenerC8913;
        this.f60912 = abstractC10324;
        this.f60911 = list;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f60913.f30569);
        this.f12806.m40697((Runnable) null);
        this.f60912.mo26151();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        char c;
        char c2;
        AbstractC10324 abstractC10324 = this.f60912;
        abstractC10324.mo26149();
        boolean zMo26140 = abstractC10324.mo26140();
        DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913 = this.f60913;
        int i = 0;
        boolean z = (zMo26140 && dialogInterfaceOnDismissListenerC8913.f30567.isChecked()) ? false : true;
        C22959 c22959M50797 = C22959.m50797();
        ArrayList arrayList = new ArrayList();
        for (C22722 c22722 : this.f60911) {
            if (c22722.f74022 != null && (z || c22722.f74020 == null)) {
                arrayList.add(c22722);
            }
        }
        int i2 = 100;
        if (abstractC10324.mo26147()) {
            BatchTranslationEngine.BatchingStrategy batchingStrategyMo26139 = abstractC10324.mo26139();
            int i3 = 0;
            while (i3 < arrayList.size() && !this.f12806.m40693()) {
                ArrayList arrayList2 = new ArrayList();
                batchingStrategyMo26139.reset();
                while (true) {
                    if (i3 < arrayList.size()) {
                        C22722 c22723 = (C22722) arrayList.get(i3);
                        String str = c22723.f74022;
                        c = 1;
                        if (!batchingStrategyMo26139.tryAdd(abstractC10324.mo26141(str, c22723.f74020))) {
                            if (arrayList2.isEmpty()) {
                                if (c22959M50797.m50802()) {
                                    C17485 c17485 = this.f12806;
                                    c2 = 2;
                                    AbstractActivityC5788 abstractActivityC5788 = dialogInterfaceOnDismissListenerC8913.f30569;
                                    Integer numValueOf = Integer.valueOf(i3 + 1);
                                    Integer numValueOf2 = Integer.valueOf(arrayList.size());
                                    String strM32189 = C13012.m32189(i2, str);
                                    Object[] objArr = new Object[3];
                                    objArr[i] = numValueOf;
                                    objArr[1] = numValueOf2;
                                    objArr[2] = strM32189;
                                    c17485.m40698(abstractActivityC5788.getString(R.string.MT_Protector, objArr));
                                } else {
                                    c2 = 2;
                                }
                                String strMo26150 = abstractC10324.mo26150(str, c22723.f74020);
                                if (!this.f12806.m40693()) {
                                    if (strMo26150 != null) {
                                        c22723.m50367(strMo26150);
                                    }
                                    i3++;
                                    break;
                                }
                                break;
                            }
                        } else {
                            arrayList2.add(c22723);
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
                    if (c22959M50797.m50802()) {
                        C17485 c17486 = this.f12806;
                        AbstractActivityC5788 abstractActivityC5789 = dialogInterfaceOnDismissListenerC8913.f30569;
                        Integer numValueOf3 = Integer.valueOf(i3);
                        Integer numValueOf4 = Integer.valueOf(arrayList.size());
                        String strM321810 = C13012.m32189(100, ((C22722) arrayList2.get(i)).f74022);
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = numValueOf3;
                        objArr2[c] = numValueOf4;
                        objArr2[c2] = strM321810;
                        c17486.m40698(abstractActivityC5789.getString(R.string.MT_Protector, objArr2));
                    }
                    String[] strArr = new String[arrayList2.size()];
                    String[] strArr2 = new String[arrayList2.size()];
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        C22722 c22724 = (C22722) arrayList2.get(i4);
                        strArr[i4] = c22724.f74022;
                        strArr2[i4] = c22724.f74020;
                    }
                    String[] strArrMo26145 = abstractC10324.mo26145(strArr, strArr2);
                    if (this.f12806.m40693()) {
                        break;
                    }
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        if (strArrMo26145[i5] != null) {
                            ((C22722) arrayList2.get(i5)).m50367(strArrMo26145[i5]);
                        }
                    }
                }
                i = 0;
                i2 = 100;
                batchingStrategyMo26139 = batchingStrategyMo26139;
            }
        } else {
            for (int i6 = 0; i6 < arrayList.size() && !this.f12806.m40693(); i6++) {
                C22722 c22725 = (C22722) arrayList.get(i6);
                if (c22959M50797.m50802()) {
                    this.f12806.m40698(dialogInterfaceOnDismissListenerC8913.f30569.getString(R.string.MT_Protector, Integer.valueOf(i6 + 1), Integer.valueOf(arrayList.size()), C13012.m32189(100, c22725.f74022)));
                }
                String strMo26151 = abstractC10324.mo26150(c22725.f74022, c22725.f74020);
                if (this.f12806.m40693()) {
                    break;
                }
                if (strMo26151 != null) {
                    c22725.m50367(strMo26151);
                }
            }
        }
        abstractC10324.mo26152();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f12806.m40693()) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
        this.f60913.f30569.m15952();
        this.f60912.mo26142();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        boolean zM40693 = this.f12806.m40693();
        DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913 = this.f60913;
        if (zM40693) {
            C15829.m37611(R.string.MT_Protector);
        } else if (!this.f60912.mo26144(exc)) {
            dialogInterfaceOnDismissListenerC8913.f30569.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
        dialogInterfaceOnDismissListenerC8913.f30569.m15952();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f60913.f30569.m15957();
        this.f12806.m40694();
    }
}
