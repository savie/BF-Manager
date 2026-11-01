package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8278 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f28763 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f28764 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f28765 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f28766 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f28767 = true;

    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:90:0x018d  */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21697(InterfaceC22762 interfaceC22762) {
        InterfaceC10975 interfaceC10975Mo28399;
        InterfaceC7945 interfaceC7945Mo25747;
        int value;
        int value2;
        int iMo20491 = interfaceC22762.mo20491();
        if (EnumC15236.PUBLIC.m36501(iMo20491) && EnumC15236.FINAL.m36501(iMo20491) && "Ljava/lang/Object;".equals(interfaceC22762.mo20494()) && interfaceC22762.mo20500().isEmpty() && !interfaceC22762.mo20489().iterator().hasNext() && !interfaceC22762.mo20486().iterator().hasNext()) {
            if (interfaceC22762.getType().endsWith("/R$styleable;")) {
                for (InterfaceC18528 interfaceC18528 : interfaceC22762.mo20495()) {
                    InterfaceC7945 interfaceC7945Mo25748 = interfaceC18528.mo25747();
                    if (interfaceC7945Mo25748 != null) {
                        if (interfaceC18528.getName().equals("<init>")) {
                            if (C22808.m50463(interfaceC7945Mo25748.mo11508()) != 2) {
                            }
                        } else if (interfaceC18528.getName().equals("<clinit>")) {
                            for (InterfaceC1594 interfaceC1594 : interfaceC7945Mo25748.mo11508()) {
                                if (interfaceC1594 instanceof InterfaceC13859) {
                                    InterfaceC13859 interfaceC13859 = (InterfaceC13859) interfaceC1594;
                                    EnumC10297 enumC10297Mo5435 = interfaceC1594.mo5435();
                                    if (enumC10297Mo5435 == EnumC10297.f35314 || enumC10297Mo5435 == EnumC10297.f35070 || enumC10297Mo5435 == EnumC10297.f35159) {
                                        if (!((InterfaceC15914) interfaceC13859.getReference()).getType().equals("[I")) {
                                        }
                                    } else if (enumC10297Mo5435 != EnumC10297.f35109 || !((InterfaceC18735) interfaceC13859.getReference()).mo1183().equals(interfaceC22762.getType())) {
                                    }
                                }
                            }
                        }
                    }
                }
                boolean z = false;
                for (InterfaceC17822 interfaceC17822 : interfaceC22762.mo20496()) {
                    if (EnumC15236.PUBLIC.m36501(interfaceC17822.mo28400())) {
                        if (interfaceC17822.getType().equals("I")) {
                            InterfaceC10975 interfaceC10975Mo283910 = interfaceC17822.mo28399();
                            if (!(interfaceC10975Mo283910 instanceof InterfaceC9564) || (value2 = (value = ((InterfaceC9564) interfaceC10975Mo283910).getValue()) >>> 24) == 127 || value2 == 1 || (value >= 0 && value <= 256)) {
                                z = true;
                            }
                        } else if (interfaceC17822.getType().equals("[I")) {
                            z = true;
                        }
                    }
                }
                return z;
            }
            Iterator it = interfaceC22762.mo20495().iterator();
            if (it.hasNext()) {
                InterfaceC18528 interfaceC18529 = (InterfaceC18528) it.next();
                if (interfaceC18529.getName().equals("<init>") && (interfaceC7945Mo25747 = interfaceC18529.mo25747()) != null && C22808.m50463(interfaceC7945Mo25747.mo11508()) == 2) {
                    if (!it.hasNext()) {
                        boolean z2 = false;
                        for (InterfaceC17822 interfaceC17823 : interfaceC22762.mo20496()) {
                            if (interfaceC17823.getType().equals("I") && EnumC15236.PUBLIC.m36501(interfaceC17823.mo28400())) {
                                interfaceC10975Mo28399 = interfaceC17823.mo28399();
                                if (!(interfaceC10975Mo28399 instanceof InterfaceC9564) && (((InterfaceC9564) interfaceC10975Mo28399).getValue() >>> 24) == 127) {
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
                    if (interfaceC17823.getType().equals("I")) {
                        interfaceC10975Mo28399 = interfaceC17823.mo28399();
                        if (!(interfaceC10975Mo28399 instanceof InterfaceC9564)) {
                        }
                    }
                }
                return z3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21696(final C11545 c11545, final C3246 c3246) {
        Main mainM28824 = c11545.m28824();
        View viewM30995 = mainM28824.m30995(R.layout.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox4 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox5 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox3.setVisibility(0);
        checkBox4.setVisibility(0);
        checkBox5.setVisibility(0);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4388.m12238(c3246.f12072, c3246.f12075, editText, editText2);
        checkBox.setChecked(f28764);
        checkBox2.setChecked(f28766);
        checkBox3.setChecked(f28763);
        checkBox4.setChecked(f28767);
        checkBox5.setChecked(f28765);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(mainM28824);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗ᩷ۨ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C8278.m21695(c3246, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, c11545);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269().m44361().setOnClickListener(new ViewOnClickListenerC4749(c3246, editText, editText2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21695(C3246 c3246, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, C11545 c11545) {
        c3246.m9717();
        f28764 = checkBox.isChecked();
        f28766 = checkBox2.isChecked();
        f28763 = checkBox3.isChecked();
        f28767 = checkBox4.isChecked();
        boolean zIsChecked = checkBox5.isChecked();
        f28765 = zIsChecked;
        AbstractC20745 abstractC20745 = c3246.f12071;
        AbstractC20745 abstractC20746 = c3246.f12074;
        boolean z = f28764;
        boolean z2 = f28766;
        boolean z3 = f28763;
        boolean z4 = f28767;
        AbstractC20745 abstractC20745M4734 = C1333.m4734(c11545, R.string.MT_Protector, "mtcr");
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C18861.class);
        c10142.m25768("saveAsPath", abstractC20745M4734.mo33986());
        c10142.m25768("inputPath1", abstractC20745.mo33986());
        c10142.m25768("inputPath2", abstractC20746.mo33986());
        c10142.m25769("ignoreDebugInfo", z);
        c10142.m25769("ignoreOptimize", z2);
        c10142.m25769("ignoreRegister", z3);
        c10142.m25769("ignoreNopInstruction", z4);
        c10142.m25769("ignoreResIdChanges", zIsChecked);
        c10142.m25763();
    }
}
