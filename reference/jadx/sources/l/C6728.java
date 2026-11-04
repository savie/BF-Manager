package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes.dex */
public final class C6728 extends AbstractC7364 implements InterfaceC0454 {

    /* JADX INFO: renamed from: ۛᩴۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f22413;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22414 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f22415;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22829 f22416;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f22417;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C23026 f22418;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f22419;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f22420;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f22421;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f22422;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17411 f22423;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f22424;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16665 f22425;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native Object m18787(C15945 c15945, Object obj);

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo18795() {
        return R.string.MT_Protector;
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2271(C8614 c8614, View view, C22829 c22829, InterfaceC19845 interfaceC19845) {
        C18353.m42811(this, c8614, c22829, interfaceC19845);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۟ */
    public final String mo10164() {
        return b.k;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10167() {
        return true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10170() {
        return false;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10177(String str) {
        return false;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ۙ */
    public final boolean mo10178() {
        return true;
    }

    static {
        ApplicationC23172.m52091(70);
        f22413 = new short[]{1389, -4509, -4568, -4563, -4552, -4563};
        C1398.m5108(b.k);
        C19540.m45072("local", b.k, new C5236());
        C19540.m45072("zip", b.k, new C22390());
        C19540.m45072("tar", b.k, new C11201());
        C19540.m45072("archive", b.k, new C23136());
        C19540.m45072("compress", b.k, new C17782(1));
        C19540.m45072("payload", b.k, new C20152());
        C19540.m45072(b.k, "local", new C15676());
        C19540.m45072(b.k, b.k, new C13439());
        C19540.m45072(b.k, "zip", new C0982());
    }

    public C6728(int i, AbstractC0148 abstractC0148) {
        super(i, "/");
        this.f22416 = new C22829(b.k, null);
        this.f22425 = new C16665(this);
        this.f22423 = new C17411(this);
        this.f22422 = new C17168(this);
        this.f22415 = new C17914(this);
        this.f22420 = new C16422(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f22424 = abstractC0148.f1127;
        AbstractC18881 abstractC18881Mo1326 = abstractC0148.mo1326(m20191());
        this.f22417 = abstractC18881Mo1326;
        abstractC18881Mo1326.f61287 = false;
        this.f22418 = new C23026(abstractC18881Mo1326);
        mo20211(abstractC18881Mo1326.mo35569());
    }

    public C6728(C20348 c20348) {
        super(c20348);
        this.f22416 = new C22829(b.k, null);
        this.f22425 = new C16665(this);
        this.f22423 = new C17411(this);
        this.f22422 = new C17168(this);
        this.f22415 = new C17914(this);
        this.f22420 = new C16422(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f22424 = c20348.readInt();
        AbstractC18881 abstractC18881M43781 = AbstractC18881.m43781(c20348);
        this.f22417 = abstractC18881M43781;
        abstractC18881M43781.f61287 = false;
        this.f22418 = new C23026(abstractC18881M43781);
    }

    public C6728(int i, String str, int i2, AbstractC18881 abstractC18881) {
        super(i, str);
        this.f22416 = new C22829(b.k, null);
        this.f22425 = new C16665(this);
        this.f22423 = new C17411(this);
        this.f22422 = new C17168(this);
        this.f22415 = new C17914(this);
        this.f22420 = new C16422(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f22424 = i2;
        this.f22417 = abstractC18881;
        abstractC18881.f61287 = false;
        this.f22418 = new C23026(abstractC18881);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10161(C6178 c6178) {
        super.mo10161(c6178);
        c6178.writeInt(this.f22424);
        this.f22417.mo20835(c6178);
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final int m18804() {
        return this.f22424;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18796(String str, boolean z) {
        AbstractC0148 abstractC0148M20792 = C7606.m20792(this.f22424);
        if (abstractC0148M20792 != null) {
            C22961.m51794(str, new C8877(abstractC0148M20792, z));
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0148 m18806() {
        return C7606.m20792(this.f22424);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֡ */
    public final String mo10159() {
        return this.f22417.f61289.mo1332() + super.mo10159();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6728 m18788(C6728 c6728, C8614 c8614, int i) {
        C6728 c6729 = new C6728(i, c6728.m20218(), c6728.f22424, (AbstractC18881) C18070.m42101(c6728.f22417.m20838(), false));
        c8614.m23180(c6729);
        return c6729;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo18799() {
        this.f22417.getClass();
        return true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۠ */
    public final void mo10165() {
        this.f22417.mo35578();
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f22421;
        if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434()) {
            return;
        }
        this.f22421.dismiss();
        this.f22421 = null;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo18801(String str) {
        return str == null || str.equals(this.f22417.mo35579());
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final void m18803() {
        this.f22417.getClass();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC7629 mo10174() {
        return this.f22417;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC18881 mo10174() {
        return this.f22417;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֨ */
    public final List mo10160() {
        String strM20218 = m20218();
        boolean z = strM20218.length() > 1;
        ArrayList arrayListMo20830 = this.f22417.mo20830(strM20218, ApplicationC17729.f58262.getBoolean("show_hidden_file", true));
        if (z) {
            arrayListMo20830.add(0, C13352.f42573);
        }
        return arrayListMo20830;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC9843 mo18808(C12915 c12915) {
        C8614 c8614M31974 = c12915.m31974();
        C7977 c7977 = new C7977(android.R.string.cut, R.drawable.MT_Protector);
        if (c8614M31974.m23228("local")) {
            C0519 c0519 = new C0519(R.string.MT_Protector, R.drawable.MT_Protector);
            c0519.m25621();
            c0519.mo2725(c7977);
            return c0519;
        }
        if (c8614M31974.m23228(b.k)) {
            C1265 c1265 = new C1265(b.k);
            c1265.mo2725(c7977);
            return c1265;
        }
        C24475 c24475 = new C24475();
        c24475.mo2725(c7977);
        return c24475;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC9843 mo18807() {
        return new C3833();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC9843 mo18805() {
        return new C25132(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC9843 mo18809() {
        return new C17146();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC9843 mo10173() {
        return new DialogInterfaceOnDismissListenerC5214();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC9843 mo18802() {
        return new C19910(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18797(InterfaceC2386 interfaceC2386) {
        mo18796(interfaceC2386.getPath(), interfaceC2386.isDirectory());
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC0895 mo10169() {
        return this.f22418;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܳ */
    public final C21535 mo10171() {
        String strM20218 = m20218();
        AbstractC18881 abstractC18881 = this.f22417;
        String name = abstractC18881.f61289.getName();
        if (!abstractC18881.f61289.f1129) {
            strM20218 = abstractC18881.f61289.mo1333() + strM20218;
        }
        return new C21535(name, strM20218, abstractC18881.f61289.getIcon());
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18798(C8614 c8614, String str, boolean z) {
        if (str.contains("/")) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            new C5982(this, c8614, C11293.m28549(m20218(), str), z, str).m8197();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10163(C8614 c8614, C8614 c8615) {
        c8614.m23174(b.k);
        AbstractC0148 abstractC0148M20792 = C7606.m20792(this.f22424);
        if (abstractC0148M20792 == null) {
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        if (!C16468.m39027(c8615.m23213(), abstractC0148M20792)) {
            C20065 c20065M23194 = c8614.m23194();
            try {
                c20065M23194.m46173();
                C2935 c2935M46163 = c20065M23194.m46163();
                boolean z = false;
                for (int i = 0; i < c2935M46163.size(); i++) {
                    if (C16468.m39027((AbstractC7364) c2935M46163.get(i), abstractC0148M20792)) {
                        c20065M23194.m46149(c8615, i, false);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    c8615.m23185(new C24054(this, c8615), new RunnableC16899(2, c8614));
                    return;
                }
            } finally {
                c20065M23194.m46157();
            }
        }
        c8614.m23212();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ */
    public final void mo10168(C8614 c8614) {
        if (this.f22419) {
            return;
        }
        List<C21120> listM20206 = m20206();
        if (listM20206.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C21120 c21120 : listM20206) {
            if (c21120.m48219()) {
                arrayList.add(c21120);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c8614.m23233().m127();
        m18791(c8614, arrayList, arrayList.size() == 1 ? C21576.m49059(R.string.MT_Protector, ((C21120) arrayList.get(0)).m48221()) : C21576.m49088(R.string.MT_Protector) + "\n" + C24276.m54283(arrayList, "\n"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m18791(final C8614 c8614, final ArrayList arrayList, String str, boolean z) {
        this.f22419 = true;
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(str);
        final RadioButton radioButton = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM40395.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) viewM40395.findViewById(R.id.radioButton4);
        if (z) {
            radioButton4.setVisibility(0);
        }
        radioButton.setChecked(true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۢۛ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButton radioButton5 = radioButton;
                radioButton5.setChecked(radioButton5 == view);
                RadioButton radioButton6 = radioButton2;
                radioButton6.setChecked(radioButton6 == view);
                RadioButton radioButton7 = radioButton3;
                radioButton7.setChecked(radioButton7 == view);
                RadioButton radioButton8 = radioButton4;
                radioButton8.setChecked(radioButton8 == view);
            }
        };
        radioButton.setOnClickListener(onClickListener);
        radioButton2.setOnClickListener(onClickListener);
        radioButton3.setOnClickListener(onClickListener);
        radioButton4.setOnClickListener(onClickListener);
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ۛ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C6728.m18789(this.f43387, c8614, radioButton, arrayList, radioButton3, radioButton4);
            }
        });
        this.f22421 = c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18789(C6728 c6728, C8614 c8614, RadioButton radioButton, ArrayList arrayList, RadioButton radioButton2, RadioButton radioButton3) {
        AbstractC22044 abstractC22044M48215 = null;
        c6728.f22421 = null;
        if (c8614.m23213() != c6728) {
            return;
        }
        if (radioButton.isChecked()) {
            new C25374(c6728, c8614, (C20168) c8614.m23233().getLifecycle(), arrayList, c6728.f22417).m8197();
            return;
        }
        if (radioButton2.isChecked()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C21120) it.next()).m48218();
            }
        } else if (radioButton3.isChecked()) {
            Iterator it2 = arrayList.iterator();
            long jM48217 = 0;
            while (it2.hasNext()) {
                C21120 c21120 = (C21120) it2.next();
                c21120.m48218();
                if (abstractC22044M48215 == null || c21120.m48217() > jM48217) {
                    abstractC22044M48215 = c21120.m48215();
                    jM48217 = c21120.m48217();
                }
            }
            if (abstractC22044M48215 != null) {
                C8614 c8614M23236 = c8614.m23236();
                c8614M23236.m23210();
                c8614M23236.m23230(abstractC22044M48215.getName());
                c8614M23236.m23226(abstractC22044M48215.m49881(), true);
            }
        }
        c6728.f22419 = false;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo18800() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f22421;
        if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434()) {
            return;
        }
        this.f22421.dismiss();
        this.f22421 = null;
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final void mo2272(C22829 c22829) {
        this.f22416 = c22829;
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final C22829 mo2270() {
        return this.f22416;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۡ */
    public final List mo10166() {
        return Arrays.asList(AbstractC7364.f24216, this.f22425, this.f22423, AbstractC7364.f24209, AbstractC7364.f24214, AbstractC7364.f24215, this.f22420, this.f22422, this.f22415, m20205(), AbstractC7364.m20186(), AbstractC7364.m20183(R.string.MT_Protector, false));
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18792() {
        return ApplicationC17729.f58262.getBoolean("show_hidden_file", true);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22044 mo10176(InterfaceC2386 interfaceC2386) {
        AbstractC22044 abstractC22044M49876 = this.f24222.m49876(C1112.m4125(m20218())).m49876(interfaceC2386.getName());
        abstractC22044M49876.mo4283();
        return abstractC22044M49876;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10162(C8614 c8614, List list, Runnable runnable) {
        new C20898(this, c8614, (C20168) c8614.m23233().getLifecycle(), list, runnable).m8197();
    }
}
