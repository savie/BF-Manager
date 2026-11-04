package l;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC21369 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final C0107 f68056 = new C0107();

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C3072 f68057;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C25227 f68058;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public List f68059 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC0726 f68060;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public TextView f68061;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "TutorialOrderListActivity";
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
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC4425(4, this));
        InterfaceC18625 interfaceC18625M3048 = AbstractC0726.m3048(this);
        interfaceC18625M3048.mo22096(new C12418(this).m52419());
        this.f68060 = interfaceC18625M3048.build();
        this.f68057 = (C3072) m40418(R.id.MT_Protector);
        this.f68058 = (C25227) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        this.f68061 = textView;
        textView.setText(R.string.MT_Protector);
        this.f68061.setOnClickListener(new View.OnClickListener() { // from class: l.᩹ܰ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0107 c0107 = ActivityC21369.f68056;
                new C4215(this.f76634, true).m8197();
            }
        });
        this.f68058.setAdapter(new C14655(this));
        new C4215(this, false).m8197();
        this.f68057.m10020(new InterfaceC17242() { // from class: l.ۗܰ᩻
            @Override // l.InterfaceC17242
            /* JADX INFO: renamed from: ۫ */
            public final void mo4897() {
                C0107 c0107 = ActivityC21369.f68056;
                new C4215(this.f12013, true).m8197();
            }
        });
        f68056.m1212(this, new InterfaceC18006() { // from class: l.᩵ܰ᩻
            @Override // l.InterfaceC18006
            /* JADX INFO: renamed from: ۙ */
            public final void mo1736(Object obj) {
                C0107 c0107 = ActivityC21369.f68056;
                new C4215(this.f66146, true).m8197();
            }
        });
    }
}
