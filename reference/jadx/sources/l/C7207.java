package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 895N */
/* JADX INFO: loaded from: classes3.dex */
public final class C7207 extends AbstractC4674 {
    public C7207() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        List<AbstractC4674> listAsList = Arrays.asList(new C0901(R.string.MT_Protector, -1), new C19164(R.string.MT_Protector, -1), new C3640(R.string.MT_Protector, -1), new C11403(), new C3723(R.string.MT_Protector, -1), new C10967(R.string.MT_Protector, -1), new C23667(R.string.MT_Protector, -1), new C14931(R.string.MT_Protector, -1));
        ArrayList arrayList = new ArrayList(listAsList.size());
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (AbstractC4674 abstractC4674 : listAsList) {
            arrayList.add(C16737.m39288(abstractC4674.m12942()));
            arrayList2.add(Boolean.valueOf(abstractC4674.mo1960(c21422)));
        }
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21274(m12942());
        c8067BuildDialog.m21260(new C10030(c21422.m47980(), arrayList, arrayList2), new DialogInterfaceOnClickListenerC8619(0, listAsList, c21422));
        c8067BuildDialog.m21269();
    }
}
