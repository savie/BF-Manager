package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16879 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f55221 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f55222 = true;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f55223 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f55224 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f55225 = true;

    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:90:0x018d  */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39843(InterfaceC10122 interfaceC10122) {
        InterfaceC16791 interfaceC16791Mo8822;
        InterfaceC7140 interfaceC7140Mo13175;
        int value;
        int value2;
        int iMo20404 = interfaceC10122.mo20404();
        if (EnumC2536.PUBLIC.m8459(iMo20404) && EnumC2536.FINAL.m8459(iMo20404) && "Ljava/lang/Object;".equals(interfaceC10122.mo20397()) && interfaceC10122.mo20402().isEmpty() && !interfaceC10122.mo20401().iterator().hasNext() && !interfaceC10122.mo20403().iterator().hasNext()) {
            if (interfaceC10122.getType().endsWith("/R$styleable;")) {
                for (InterfaceC8631 interfaceC8631 : interfaceC10122.mo20405()) {
                    InterfaceC7140 interfaceC7140Mo13176 = interfaceC8631.mo13175();
                    if (interfaceC7140Mo13176 != null) {
                        if (interfaceC8631.getName().equals("<init>")) {
                            if (C16625.m39340(interfaceC7140Mo13176.mo2840()) != 2) {
                            }
                        } else if (interfaceC8631.getName().equals("<clinit>")) {
                            for (InterfaceC23331 interfaceC23331 : interfaceC7140Mo13176.mo2840()) {
                                if (interfaceC23331 instanceof InterfaceC6177) {
                                    InterfaceC6177 interfaceC6177 = (InterfaceC6177) interfaceC23331;
                                    EnumC22631 enumC22631Mo30864 = interfaceC23331.mo30864();
                                    if (enumC22631Mo30864 == EnumC22631.f73504 || enumC22631Mo30864 == EnumC22631.f73329 || enumC22631Mo30864 == EnumC22631.f73312) {
                                        if (!((InterfaceC19775) interfaceC6177.getReference()).getType().equals("[I")) {
                                        }
                                    } else if (enumC22631Mo30864 != EnumC22631.f73445 || !((InterfaceC8304) interfaceC6177.getReference()).mo4500().equals(interfaceC10122.getType())) {
                                    }
                                }
                            }
                        }
                    }
                }
                boolean z = false;
                for (InterfaceC2665 interfaceC2665 : interfaceC10122.mo20398()) {
                    if (EnumC2536.PUBLIC.m8459(interfaceC2665.mo8823())) {
                        if (interfaceC2665.getType().equals("I")) {
                            InterfaceC16791 interfaceC16791Mo8823 = interfaceC2665.mo8822();
                            if (!(interfaceC16791Mo8823 instanceof InterfaceC3367) || (value2 = (value = ((InterfaceC3367) interfaceC16791Mo8823).getValue()) >>> 24) == 127 || value2 == 1 || (value >= 0 && value <= 256)) {
                                z = true;
                            }
                        } else if (interfaceC2665.getType().equals("[I")) {
                            z = true;
                        }
                    }
                }
                return z;
            }
            Iterator it = interfaceC10122.mo20405().iterator();
            if (it.hasNext()) {
                InterfaceC8631 interfaceC8632 = (InterfaceC8631) it.next();
                if (interfaceC8632.getName().equals("<init>") && (interfaceC7140Mo13175 = interfaceC8632.mo13175()) != null && C16625.m39340(interfaceC7140Mo13175.mo2840()) == 2) {
                    if (!it.hasNext()) {
                        boolean z2 = false;
                        for (InterfaceC2665 interfaceC2666 : interfaceC10122.mo20398()) {
                            if (interfaceC2666.getType().equals("I") && EnumC2536.PUBLIC.m8459(interfaceC2666.mo8823())) {
                                interfaceC16791Mo8822 = interfaceC2666.mo8822();
                                if (!(interfaceC16791Mo8822 instanceof InterfaceC3367) && (((InterfaceC3367) interfaceC16791Mo8822).getValue() >>> 24) == 127) {
                                    z2 = true;
                                }
                            }
                        }
                        return z2;
                    }
                }
            } else if (!it.hasNext()) {
                boolean z3 = false;
                while (r12.hasNext()) {
                    if (interfaceC2666.getType().equals("I")) {
                        interfaceC16791Mo8822 = interfaceC2666.mo8822();
                        if (!(interfaceC16791Mo8822 instanceof InterfaceC3367)) {
                        }
                    }
                }
                return z3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39842(final C9170 c9170, final C8614 c8614) {
        Main mainM23233 = c8614.m23233();
        View viewM40395 = mainM23233.m40395(R.layout.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox4 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox5 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox3.setVisibility(0);
        checkBox4.setVisibility(0);
        checkBox5.setVisibility(0);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        c23255.m54107(true);
        c23256.m54107(true);
        C2459.m8293(c9170.f29768, c9170.f29767, c23255, c23256);
        checkBox.setChecked(f55221);
        checkBox2.setChecked(f55222);
        checkBox3.setChecked(f55225);
        checkBox4.setChecked(f55224);
        checkBox5.setChecked(f55223);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(mainM23233);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨ۘۤ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C16879.m39841(c9170, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, c8614);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016().m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۡۘۤ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9170 c9171 = c9170;
                c9171.m24304();
                C2459.m8293(c9171.f29768, c9171.f29767, c23255, c23256);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39841(C9170 c9170, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, C8614 c8614) {
        c9170.m24303();
        f55221 = checkBox.isChecked();
        f55222 = checkBox2.isChecked();
        f55225 = checkBox3.isChecked();
        f55224 = checkBox4.isChecked();
        boolean zIsChecked = checkBox5.isChecked();
        f55223 = zIsChecked;
        AbstractC22044 abstractC22044 = c9170.f29765;
        AbstractC22044 abstractC22045 = c9170.f29769;
        boolean z = f55221;
        boolean z2 = f55222;
        boolean z3 = f55225;
        boolean z4 = f55224;
        AbstractC22044 abstractC22044M33163 = C13485.m33163(c8614, R.string.MT_Protector, "mtcr");
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C25085.class);
        c8458.m22719("saveAsPath", abstractC22044M33163.mo4294());
        c8458.m22719("inputPath1", abstractC22044.mo4294());
        c8458.m22719("inputPath2", abstractC22045.mo4294());
        c8458.m22720("ignoreDebugInfo", z);
        c8458.m22720("ignoreOptimize", z2);
        c8458.m22720("ignoreRegister", z3);
        c8458.m22720("ignoreNopInstruction", z4);
        c8458.m22720("ignoreResIdChanges", zIsChecked);
        c8458.m22714();
    }
}
