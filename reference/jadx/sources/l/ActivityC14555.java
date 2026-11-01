package l;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC14555 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final C16609 f47653 = new C16609();

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C17492 f47654;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public TextView f47655;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public AbstractC14883 f47656;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C6018 f47657;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public List f47658 = Collections.EMPTY_LIST;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "TutorialOrderListActivity";
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
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC20314(2, this));
        InterfaceC22644 interfaceC22644M35579 = AbstractC14883.m35579(this);
        interfaceC22644M35579.mo47705(new C12438(this).m1041());
        this.f47656 = interfaceC22644M35579.build();
        this.f47657 = (C6018) m31016(R.id.MT_Protector);
        this.f47654 = (C17492) m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        this.f47655 = textView;
        textView.setText(R.string.MT_Protector);
        this.f47655.setOnClickListener(new View.OnClickListener() { // from class: l.᩶۬᩺
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16609 c16609 = ActivityC14555.f47653;
                new C11027(this.f65549, true).m10243();
            }
        });
        this.f47654.setAdapter(new C23727(this));
        new C11027(this, false).m10243();
        this.f47657.m16334(new InterfaceC16602() { // from class: l.֡۬᩺
            @Override // l.InterfaceC16602
            /* JADX INFO: renamed from: ۖ */
            public final void mo2119() {
                C16609 c16609 = ActivityC14555.f47653;
                new C11027(this.f2031, true).m10243();
            }
        });
        f47653.m39052(this, new InterfaceC0380() { // from class: l.ܽ۬᩺
            @Override // l.InterfaceC0380
            /* JADX INFO: renamed from: ۙ */
            public final void mo1825(Object obj) {
                C16609 c16609 = ActivityC14555.f47653;
                new C11027(this.f53441, true).m10243();
            }
        });
    }
}
