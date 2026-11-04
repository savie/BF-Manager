package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֫᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I8G2 */
/* JADX INFO: loaded from: classes2.dex */
public class C2260 extends LinearLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f7391;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CheckedTextView f7392;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f7393;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckedTextView f7394;

    public C2260(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2260(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ViewOnClickListenerC13446 viewOnClickListenerC13446 = new ViewOnClickListenerC13446(this);
        new C22810(getResources());
        new ArrayList();
        this.f7391 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f7394 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(bin.mt.plus.R.string.MT_Protector);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC13446);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f7392 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(bin.mt.plus.R.string.MT_Protector);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC13446);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7689(C2260 c2260, View view) {
        CheckedTextView checkedTextView = c2260.f7392;
        HashMap map = c2260.f7391;
        CheckedTextView checkedTextView2 = c2260.f7394;
        if (view == checkedTextView2) {
            c2260.f7393 = true;
            map.clear();
        } else if (view == checkedTextView) {
            c2260.f7393 = false;
            map.clear();
        } else {
            c2260.f7393 = false;
            Object tag = view.getTag();
            tag.getClass();
            throw null;
        }
        checkedTextView2.setChecked(c2260.f7393);
        checkedTextView.setChecked(!c2260.f7393 && map.isEmpty());
        throw null;
    }
}
