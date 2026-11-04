package l;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.۠ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CIS6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8723 extends C6520 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C9898 f28395;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8723(ContextThemeWrapper contextThemeWrapper, C5752 c5752, List list, C15655 c15655, int i, C7276 c7276) {
        super(contextThemeWrapper, null, R.attr.MT_Protector, 0);
        View view = null;
        this.f28395 = new C9898(contextThemeWrapper);
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Integer) it.next()).intValue();
            C9898 c9898 = this.f28395;
            StringBuilder sbM12235 = C3769.m12235(iIntValue, "#", " ");
            sbM12235.append(C2012.m6896((String) ((C20131) c15655.f50877.get(iIntValue)).f64695.get(Name.LABEL)));
            MenuItem menuItemAdd = c9898.add(0, iIntValue, 0, sbM12235.toString());
            if (iIntValue != i) {
                z = false;
            }
            menuItemAdd.setChecked(z);
        }
        this.f28395.setGroupCheckable(0, true, true);
        C18103 c18103 = new C18103(contextThemeWrapper, R.layout.MT_Protector);
        c18103.setCallback(new C9468(this));
        this.f28395.addMenuPresenter(c18103);
        this.f28395.setCallback(new C2757(this, c7276));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(contextThemeWrapper);
        C0204 c0204 = new C0204(this.f28395, layoutInflaterFrom, false, R.layout.MT_Protector);
        mo18835(c0204);
        m39944(c5752);
        m39956();
        m39955();
        View viewInflate = layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(android.R.id.title)).setText(R.string.MT_Protector);
        int iRound = Math.round(contextThemeWrapper.getResources().getDisplayMetrics().density * 8.0f);
        viewInflate.setPadding(viewInflate.getPaddingLeft(), viewInflate.getPaddingTop() + iRound, viewInflate.getPaddingRight(), viewInflate.getPaddingBottom() + iRound);
        viewInflate.setEnabled(false);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        m39960(viewInflate);
        int iMax = Math.max(contextThemeWrapper.getResources().getDisplayMetrics().widthPixels / 2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
        viewInflate.measure(iMakeMeasureSpec, 0);
        int measuredWidth = viewInflate.getMeasuredWidth();
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        for (int i2 = 0; i2 < c0204.getCount() && measuredWidth < iMax; i2++) {
            view = c0204.getView(i2, view, linearLayout);
            view.measure(iMakeMeasureSpec, 0);
            measuredWidth = Math.max(measuredWidth, view.getMeasuredWidth());
        }
        m39961(measuredWidth);
        m39945(new AdapterView.OnItemClickListener() { // from class: l.֨ܶܳ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i3, long j) {
                this.f4559.f28395.performIdentifierAction(((MenuItem) adapterView.getItemAtPosition(i3)).getItemId(), 0);
            }
        });
    }

    @Override // l.C16960, l.InterfaceC16501
    public final void show() {
        boolean zIsShowing = isShowing();
        super.show();
        if (!zIsShowing) {
            int i = 0;
            while (true) {
                C9898 c9898 = this.f28395;
                if (i >= c9898.size()) {
                    break;
                }
                if (c9898.getItem(i).isChecked()) {
                    m39953(i);
                    break;
                }
                i++;
            }
        }
        mo39127().setOnKeyListener(new View.OnKeyListener() { // from class: l.ۢܶܳ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                C8723 c8723 = this.f32656;
                c8723.getClass();
                if (i2 != 82 || keyEvent.getAction() != 1) {
                    return false;
                }
                c8723.dismiss();
                return true;
            }
        });
    }
}
