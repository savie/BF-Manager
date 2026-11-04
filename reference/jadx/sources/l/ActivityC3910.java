package l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3910 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final C0107 f13365 = new C0107();

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public List f13366 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C3072 f13367;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C25227 f13368;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC0726 f13369;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public TextView f13370;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "TutorialListActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC6591(3, this));
        this.f13369 = C23302.m52413((Context) this, true);
        this.f13367 = (C3072) m40418(R.id.MT_Protector);
        this.f13368 = (C25227) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        this.f13370 = textView;
        textView.setText(R.string.MT_Protector);
        this.f13370.setOnClickListener(new View.OnClickListener() { // from class: l.ۗۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0107 c0107 = ActivityC3910.f13365;
                new C6148(this.f10269, true).m8197();
            }
        });
        this.f13368.setAdapter(new C24048(this));
        new C6148(this, false).m8197();
        this.f13367.m10020(new InterfaceC17242() { // from class: l.᩵ۘ᩻
            @Override // l.InterfaceC17242
            /* JADX INFO: renamed from: ۫ */
            public final void mo4897() {
                C0107 c0107 = ActivityC3910.f13365;
                new C6148(this.f65201, true).m8197();
            }
        });
        f13365.m1212(this, new InterfaceC18006() { // from class: l.ۨۘ᩻
            @Override // l.InterfaceC18006
            /* JADX INFO: renamed from: ۙ */
            public final void mo1736(Object obj) {
                C0107 c0107 = ActivityC3910.f13365;
                new C6148(this.f38971, true).m8197();
            }
        });
    }
}
