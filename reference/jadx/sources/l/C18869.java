package l;

import android.content.Intent;
import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ᩴܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18869 extends AbstractViewOnClickListenerC10549 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14600 f61101;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f61102;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f61103;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f61104;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19575 f61105;

    @Override // l.AbstractC14389
    /* JADX INFO: renamed from: ܰ */
    public final int mo13629() {
        return 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18869(C19575 c19575, Main main, AbstractC20745 abstractC20745) {
        super(main);
        this.f61105 = c19575;
        this.f61101 = C0690.f2926.f2944;
        this.f61102 = abstractC20745.getName();
        String strMo33986 = abstractC20745.mo33986();
        this.f61104 = strMo33986;
        int iIndexOf = strMo33986.indexOf("Android/data/");
        if (iIndexOf == -1) {
            this.f61103 = strMo33986;
        } else {
            this.f61103 = strMo33986.substring(iIndexOf);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C19575 c19575 = this.f61105;
        if (c19575.f21343.m31494() || AbstractViewOnClickListenerC10549.f36130.m50803()) {
            return;
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(this.f61104, new String[0]);
        if (abstractC20745M15313.mo33975()) {
            String strMo33986 = abstractC20745M15313.mo33986();
            int i = ActivityC5677.f19358;
            Main main = this.f47137;
            Intent intent = new Intent(main, (Class<?>) ActivityC5677.class);
            intent.putExtra("projectPath", strMo33986);
            main.startActivity(intent);
            return;
        }
        c19575.m44681();
    }
}
