package l;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۚܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4GW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5781 implements InterfaceC19795, InterfaceC11502, InterfaceC16643, TextInputLayout.LengthCounter, InterfaceC22615 {
    @Override // l.InterfaceC22615
    public Object construct() {
        return new ArrayDeque();
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // l.InterfaceC11502
    /* JADX INFO: renamed from: ۙ */
    public void mo3292() {
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC16643
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo16881(String str) {
        try {
            InterfaceC16318[] interfaceC16318ArrM33890 = ((RunnableC13904) C10351.m26627().mo2872()).m33890(str);
            return interfaceC16318ArrM33890.length > 0 ? interfaceC16318ArrM33890[0].mo28044() : str;
        } catch (IOException unused) {
            return str;
        }
    }
}
