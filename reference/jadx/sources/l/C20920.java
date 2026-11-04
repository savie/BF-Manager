package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20920 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7495 f66939;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20920(C7495 c7495) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f66939 = c7495;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        Intent intent = new Intent(c8614.m23233(), (Class<?>) ViewOnLayoutChangeListenerC6673.class);
        intent.putExtra("PATH", this.f66939.m20193());
        c8614.m23233().startActivity(intent);
    }
}
