package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 698T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18925 extends AbstractC9843 {
    public C18925() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        if (c12915.m31981() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c12915.m31982().iterator();
            while (it.hasNext()) {
                arrayList.add(new C14406((InterfaceC2386) it.next()));
            }
            c12915.m31987().mo10162(c12915.m31983(), arrayList, new RunnableC21163(this, arrayList, c12915));
            return;
        }
        final C8614 c8614M31974 = c12915.m31974();
        c12915.m31987().m20201(c12915.m31983(), c12915.m31989(), new InterfaceC9600() { // from class: l.ܿ۟ܳ
            @Override // l.InterfaceC9600
            /* JADX INFO: renamed from: ۙ */
            public final void mo1839(final C14406 c14406) {
                c14406.m34838();
                final C8614 c8614 = c8614M31974;
                AbstractC7364 abstractC7364M23213 = c8614.m23213();
                InterfaceC2386 interfaceC2386M23235 = c8614.m23235();
                final C18925 c18925 = this.f59414;
                final C12915 c12916 = c12915;
                abstractC7364M23213.m20201(c8614, interfaceC2386M23235, new InterfaceC9600() { // from class: l.֡۟ܳ
                    @Override // l.InterfaceC9600
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final void mo1839(C14406 c14407) {
                        C18925.m43943(c18925, c14406, c12916, c8614, c14407);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43942(C18925 c18925, ArrayList arrayList, C12915 c12915) {
        ((C14406) arrayList.get(0)).m34838();
        ((C14406) arrayList.get(1)).m34838();
        AbstractC22044 abstractC22044M34845 = ((C14406) arrayList.get(0)).m34845();
        AbstractC22044 abstractC22044M34846 = ((C14406) arrayList.get(1)).m34845();
        C9170 c9170 = new C9170(abstractC22044M34845, abstractC22044M34846, abstractC22044M34845.mo4294(), abstractC22044M34846.mo4294(), c12915.m31987(), c12915.m31987());
        C8614 c8614M31983 = c12915.m31983();
        c9170.m24305();
        c18925.m43941(c9170, c8614M31983);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43943(C18925 c18925, C14406 c14406, C12915 c12915, C8614 c8614, C14406 c14407) {
        String name;
        String name2;
        c14407.m34838();
        AbstractC22044 abstractC22044M34845 = c14406.m34845();
        AbstractC22044 abstractC22044M34846 = c14407.m34845();
        boolean zM23195 = c12915.m31983().m23195();
        if (abstractC22044M34845.getName().equals(abstractC22044M34846.getName())) {
            int i = R.string.MT_Protector;
            name = C21576.m49059(zM23195 ? R.string.MT_Protector : R.string.MT_Protector, abstractC22044M34845.getName());
            if (!zM23195) {
                i = R.string.MT_Protector;
            }
            name2 = C21576.m49059(i, abstractC22044M34846.getName());
        } else {
            name = abstractC22044M34845.getName();
            name2 = abstractC22044M34846.getName();
        }
        C9170 c9170 = new C9170(c14406.m34845(), c14407.m34845(), name, name2, c12915.m31987(), c8614.m23213());
        if (!zM23195) {
            c9170.m24304();
        }
        c18925.m43941(c9170, c12915.m31983());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43941(C9170 c9170, C8614 c8614) {
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(m25627());
        c23255.m54107(true);
        c23256.m54107(true);
        C2459.m8293(c9170.f29768, c9170.f29767, c23255, c23256);
        Main mainM23233 = c8614.m23233();
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(mainM23233);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0983(this, c9170, c8614));
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016().m22440().setOnClickListener(new ViewOnClickListenerC20378(c9170, c23255, c23256, 1));
    }
}
