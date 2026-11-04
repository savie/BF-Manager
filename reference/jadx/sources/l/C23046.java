package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23046 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10628 f74794;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16332 f74795;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9685 f74796;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5564 f74797;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5122 f74798;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23046(C16332 c16332, ActivityC0848 activityC0848, C10628 c10628, C5122 c5122, C5564 c5564, C9685 c9685) {
        super(activityC0848, -1);
        this.f74795 = c16332;
        this.f74794 = c10628;
        this.f74798 = c5122;
        this.f74797 = c5564;
        this.f74796 = c9685;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        int i;
        try {
            int i2 = Integer.parseInt(m22914());
            if (i2 <= 0) {
                throw new Exception();
            }
            m22951();
            C10628 c10628 = this.f74794;
            int iMo2841 = c10628.mo2841();
            int i3 = i2 + iMo2841;
            EnumC2536 enumC2536 = EnumC2536.STATIC;
            C5122 c5122 = this.f74798;
            int i4 = !enumC2536.m8459(c5122.mo13184()) ? 1 : 0;
            Iterator<E> it = c5122.mo6805().iterator();
            while (it.hasNext()) {
                i4 = C23800.m53096(((C21530) it.next()).getType()) ? i4 + 2 : i4 + 1;
            }
            int i5 = iMo2841 - i4;
            int i6 = i3 - i4;
            c10628.m27112(i3);
            ArrayList arrayList = new ArrayList();
            if (EnumC2536.STATIC.m8459(c5122.mo13184())) {
                i = 0;
            } else {
                if (i5 >= 16 || i6 >= 16) {
                    arrayList.add(new C22320(EnumC22631.f73465, i5, i6));
                } else {
                    arrayList.add(new C20325(EnumC22631.f73393, i5, i6));
                }
                i = 1;
            }
            for (C21530 c21530 : c5122.mo6805()) {
                int i7 = i5 + i;
                int i8 = i6 + i;
                int i9 = i + 1;
                if (C23800.m53096(c21530.getType())) {
                    i += 2;
                    if (i7 >= 16 || i8 >= 16) {
                        arrayList.add(new C22320(EnumC22631.f73245, i7, i8));
                    } else {
                        arrayList.add(new C20325(EnumC22631.f73345, i7, i8));
                    }
                } else {
                    if (c21530.getType().length() == 1) {
                        if (i7 >= 16 || i8 >= 16) {
                            arrayList.add(new C22320(EnumC22631.f73302, i7, i8));
                        } else {
                            arrayList.add(new C20325(EnumC22631.f73369, i7, i8));
                        }
                    } else if (i7 >= 16 || i8 >= 16) {
                        arrayList.add(new C22320(EnumC22631.f73465, i7, i8));
                    } else {
                        arrayList.add(new C20325(EnumC22631.f73393, i7, i8));
                    }
                    i = i9;
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c10628.m27107(i10, (AbstractC12384) arrayList.get(i10));
            }
            C18459 c18459 = new C18459();
            C2161 c2161 = new C2161(new C0560(c18459));
            C22718 c22718 = new C22718(this.f74797, c5122, c10628);
            try {
                c22718.m51247(c2161);
                c22718.m51250();
                c18459.m43009(c18459.length() - 1);
                C16332 c16332 = this.f74795;
                InterfaceC19106 interfaceC19106M54021 = c16332.f53032.m54021();
                C9685 c9685 = this.f74796;
                interfaceC19106M54021.replace(c9685.m25269(), c9685.m25268(), c18459);
                c16332.f53032.mo52339(c9685.m25269() + TextUtils.indexOf((CharSequence) c18459, '\n', TextUtils.indexOf((CharSequence) c18459, '\n') + 1));
                c16332.f53032.m54065();
                c16332.f53032.m53931(false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
