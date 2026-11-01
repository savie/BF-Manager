package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G9AG */
/* JADX INFO: loaded from: classes.dex */
public final class C22775 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        c21422.m47963(b.k);
        AbstractC12068 abstractC12068M23630 = ((C9183) c21422.m47960()).m23630();
        if (abstractC12068M23630 == null) {
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        C5546 c5546 = new C5546(abstractC12068M23630, true);
        C5546 c5547 = new C5546(abstractC12068M23630, false);
        final ArrayList arrayList = new ArrayList();
        for (InterfaceC2557 interfaceC2557 : c21422.m47979()) {
            arrayList.add(C23186.m51196(interfaceC2557.getPath(), interfaceC2557.isDirectory() ? c5546 : c5547));
        }
        final C6936 c6936M28807 = c21422.m47965().m28807();
        if (arrayList.size() <= 5) {
            C23186.m51186(arrayList, c6936M28807.m18653());
            C10361.m26259(c21422.m47980());
            return;
        }
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۚ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C23186.m51186(arrayList, c6936M28807.m18653());
                C10361.m26259(c21422.m47980());
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
