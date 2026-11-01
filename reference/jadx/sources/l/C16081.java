package l;

import android.view.View;
import android.widget.TextView;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16081 implements InterfaceC4509, InterfaceC11754, InterfaceC5846, InterfaceC8818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52009;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52010;

    public /* synthetic */ C16081(Object obj, Object obj2) {
        this.f52009 = obj;
        this.f52010 = obj2;
    }

    @Override // l.InterfaceC11754
    public C15844 onApplyWindowInsets(View view, C15844 c15844) {
        ActivityC10957.m27589((ActivityC10957) this.f52009, (C12562) this.f52010, c15844);
        return c15844;
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        C13913 c13913 = (C13913) this.f52009;
        C13913.m33747((TextView) this.f52010, textView, c13913.f45827.m28817().mo13029(), c13913.f45830);
    }

    @Override // l.InterfaceC5846
    /* JADX INFO: renamed from: ۙ */
    public void mo16056(String str, String str2, boolean z, boolean z2, boolean z3) {
        ViewOnClickListenerC10786.m27083((ViewOnClickListenerC10786) this.f52009, (Set) this.f52010, str, str2, z, z2, z3);
    }

    @Override // l.InterfaceC8818
    /* JADX INFO: renamed from: ۙ */
    public void mo22947(C10229 c10229, EnumC8112 enumC8112, AbstractC16579 abstractC16579, boolean z) {
        C10229 c102210 = (C10229) this.f52009;
        C19003 c19003 = (C19003) this.f52010;
        c102210.getClass();
        C6171.m17176(c10229 == c102210);
        c19003.m43723(new C2068(enumC8112, abstractC16579));
    }

    @Override // l.InterfaceC8818
    /* JADX INFO: renamed from: ۙ */
    public void mo22946(C10229 c10229) {
        C6171.m17170();
        throw null;
    }
}
