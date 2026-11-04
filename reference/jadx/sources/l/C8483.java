package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1YM */
/* JADX INFO: loaded from: classes4.dex */
public class C8483 extends AbstractC9843 {
    public C8483() {
        this(R.string.MT_Protector);
    }

    public C8483(int i) {
        super(i, R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo22798(Main main, final C9170 c9170) {
        int i = C2459.f7887;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        c23255.m54107(true);
        c23256.m54107(true);
        C2459.m8293(c9170.f29768, c9170.f29767, c23255, c23256);
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(main);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18867(0, c9170, main));
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016().m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۢۚ᩸
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9170 c9171 = c9170;
                c9171.m24304();
                C2459.m8293(c9171.f29768, c9171.f29767, c23255, c23256);
            }
        });
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        boolean z = this instanceof C9974;
        if (!z && !C18978.m44078()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (c12915.m31981() == 2) {
            final ArrayList arrayList = new ArrayList(4);
            HashSet hashSet = new HashSet();
            for (InterfaceC2386 interfaceC2386 : c12915.m31982()) {
                arrayList.add(new C14406(interfaceC2386));
                hashSet.add(interfaceC2386.getParent());
            }
            if (!z) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C14406("resources.arsc", (String) it.next(), false, true));
                }
            }
            c12915.m31987().mo10162(c12915.m31983(), arrayList, new Runnable() { // from class: l.֨۟ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList2 = arrayList;
                    ((C14406) arrayList2.get(0)).m34838();
                    ((C14406) arrayList2.get(1)).m34838();
                    AbstractC22044 abstractC22044M34845 = ((C14406) arrayList2.get(0)).m34845();
                    AbstractC22044 abstractC22044M34846 = ((C14406) arrayList2.get(1)).m34845();
                    String strMo4294 = abstractC22044M34845.mo4294();
                    String strMo4295 = abstractC22044M34846.mo4294();
                    C12915 c12916 = c12915;
                    C9170 c9170 = new C9170(abstractC22044M34845, abstractC22044M34846, strMo4294, strMo4295, c12916.m31987(), c12916.m31987());
                    Main mainM31979 = c12916.m31979();
                    c9170.m24305();
                    this.f3711.mo22798(mainM31979, c9170);
                }
            });
            return;
        }
        final C8614 c8614M31974 = c12915.m31974();
        final ArrayList arrayList2 = new ArrayList(2);
        final ArrayList arrayList3 = new ArrayList(2);
        InterfaceC2386 interfaceC2386M31989 = c12915.m31989();
        InterfaceC2386 interfaceC2386M23235 = c8614M31974.m23235();
        arrayList2.add(new C14406(interfaceC2386M31989));
        if (!z) {
            arrayList2.add(new C14406("resources.arsc", interfaceC2386M31989.getParent(), false, true));
        }
        arrayList3.add(new C14406(interfaceC2386M23235));
        if (!z) {
            arrayList3.add(new C14406("resources.arsc", interfaceC2386M23235.getParent(), false, true));
        }
        c12915.m31987().mo10162(c12915.m31983(), arrayList2, new Runnable() { // from class: l.ۡ۟ܳ
            @Override // java.lang.Runnable
            public final void run() {
                final ArrayList arrayList4 = arrayList2;
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((C14406) it2.next()).m34838();
                }
                final C8614 c8614 = c8614M31974;
                AbstractC7364 abstractC7364M23213 = c8614.m23213();
                final C12915 c12916 = c12915;
                final C8483 c8483 = this;
                final ArrayList arrayList5 = arrayList3;
                abstractC7364M23213.mo10162(c8614, arrayList5, new Runnable() { // from class: l.ۖ۟ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        String name;
                        String name2;
                        ArrayList arrayList6 = arrayList5;
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            ((C14406) it3.next()).m34838();
                        }
                        AbstractC22044 abstractC22044M34845 = ((C14406) arrayList4.get(0)).m34845();
                        AbstractC22044 abstractC22044M34846 = ((C14406) arrayList6.get(0)).m34845();
                        C12915 c12917 = c12916;
                        boolean zM23195 = c12917.m31983().m23195();
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
                        C9170 c9170 = new C9170(abstractC22044M34845, abstractC22044M34846, name, name2, c12917.m31987(), c8614.m23213());
                        if (!zM23195) {
                            c9170.m24304();
                        }
                        c8483.mo22798(c12917.m31979(), c9170);
                    }
                });
            }
        });
    }
}
