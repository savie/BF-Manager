package l;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes2.dex */
public final class C1972 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f6614;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4955 f6615;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f6616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f6617;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12853 f6618;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25093 f6619;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f6620;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f6621;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f6622;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f6623;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final View f6624;

    public C1972(C25093 c25093, String str, int i) {
        this.f6619 = c25093;
        this.f6614 = str;
        this.f6616 = i;
        this.f6618 = C12853.m31892(c25093.f81149, c25093.f81148.m46655(), str);
        View viewM40395 = c25093.f81138.m40395(R.layout.MT_Protector);
        this.f6624 = viewM40395;
        C25227 c25227 = (C25227) viewM40395.findViewById(R.id.MT_Protector);
        c25227.setLayoutManager(new C19458((Context) c25093.f81138, 3));
        C4955 c4955 = new C4955(c25093, this);
        this.f6615 = c4955;
        c25227.setAdapter(c4955);
        this.f6620 = viewM40395.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f6622 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.۫ܰᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1972 c1972 = this.f42083;
                if (c1972.f6617) {
                    c1972.m6791();
                }
            }
        });
        C18597.m43181(c25227);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6791() {
        if (this.f6623 || this.f6621 || this.f6619.f81151) {
            return;
        }
        this.f6621 = true;
        this.f6617 = false;
        m6792();
        new C5701(this).m8197();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6792() {
        int i = 8;
        this.f6620.setVisibility(this.f6621 ? 0 : 8);
        int i2 = this.f6617 ? R.string.MT_Protector : R.string.MT_Protector;
        TextView textView = this.f6622;
        textView.setText(i2);
        textView.setClickable(this.f6617);
        if (!this.f6621 && ((this.f6623 || this.f6617) && this.f6615.getItemCount() == 0)) {
            i = 0;
        }
        textView.setVisibility(i);
    }
}
