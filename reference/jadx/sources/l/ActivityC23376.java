package l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23376 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final C16609 f75722 = new C16609();

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C6018 f75723;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public TextView f75724;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public AbstractC14883 f75725;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public List f75726 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C17492 f75727;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "TutorialListActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC14141(6, this));
        this.f75725 = C0091.m1034((Context) this, true);
        this.f75723 = (C6018) m31016(R.id.MT_Protector);
        this.f75727 = (C17492) m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        this.f75724 = textView;
        textView.setText(R.string.MT_Protector);
        this.f75724.setOnClickListener(new View.OnClickListener() { // from class: l.ܽ֨᩺
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16609 c16609 = ActivityC23376.f75722;
                new C5736(this.f52554, true).m10243();
            }
        });
        this.f75727.setAdapter(new C10676(this));
        new C5736(this, false).m10243();
        this.f75723.m16334(new InterfaceC16602() { // from class: l.۫֨᩺
            @Override // l.InterfaceC16602
            /* JADX INFO: renamed from: ۖ */
            public final void mo2119() {
                C16609 c16609 = ActivityC23376.f75722;
                new C5736(this.f40446, true).m10243();
            }
        });
        f75722.m39052(this, new InterfaceC0380() { // from class: l.ܿ֨᩺
            @Override // l.InterfaceC0380
            /* JADX INFO: renamed from: ۙ */
            public final void mo1825(Object obj) {
                C16609 c16609 = ActivityC23376.f75722;
                new C5736(this.f54389, true).m10243();
            }
        });
    }
}
