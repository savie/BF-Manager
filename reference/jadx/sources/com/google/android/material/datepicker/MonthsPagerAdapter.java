package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import l.AbstractC0414;
import l.AbstractC12554;
import l.C15089;
import l.C22432;
import l.C3798;
import l.C5031;

/* JADX INFO: loaded from: classes.dex */
public class MonthsPagerAdapter extends AbstractC0414 {
    public final CalendarConstraints calendarConstraints;
    public final DateSelector dateSelector;
    public final DayViewDecorator dayViewDecorator;
    public final int itemHeight;
    public final MaterialCalendar.OnDayClickListener onDayClickListener;

    public MonthsPagerAdapter(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.OnDayClickListener onDayClickListener) {
        Month start = calendarConstraints.getStart();
        Month end = calendarConstraints.getEnd();
        Month openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (openAt.compareTo(end) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.itemHeight = (MonthAdapter.MAXIMUM_WEEKS * MaterialCalendar.getDayHeight(context)) + (MaterialDatePicker.isFullscreen(context) ? MaterialCalendar.getDayHeight(context) : 0);
        this.calendarConstraints = calendarConstraints;
        this.dateSelector = dateSelector;
        this.dayViewDecorator = dayViewDecorator;
        this.onDayClickListener = onDayClickListener;
        setHasStableIds(true);
    }

    public class ViewHolder extends AbstractC12554 {
        public final MaterialCalendarGridView monthGrid;
        public final TextView monthTitle;

        public ViewHolder(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C3798.f13775);
            this.monthTitle = textView;
            C5031.m13993((View) textView, true);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(C3798.f13752);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    @Override // l.AbstractC0414
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C15089.f49207, viewGroup, false);
        if (MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new C22432(-1, this.itemHeight));
            return new ViewHolder(linearLayout, true);
        }
        return new ViewHolder(linearLayout, false);
    }

    @Override // l.AbstractC0414
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Month monthMonthsLater = this.calendarConstraints.getStart().monthsLater(i);
        viewHolder.monthTitle.setText(monthMonthsLater.getLongName());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.monthGrid.findViewById(C3798.f13752);
        if (materialCalendarGridView.getAdapter() != null && monthMonthsLater.equals(materialCalendarGridView.getAdapter().month)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().updateSelectedStates(materialCalendarGridView);
        } else {
            MonthAdapter monthAdapter = new MonthAdapter(monthMonthsLater, this.dateSelector, this.calendarConstraints, this.dayViewDecorator);
            materialCalendarGridView.setNumColumns(monthMonthsLater.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                if (materialCalendarGridView.getAdapter().withinMonth(i2)) {
                    MonthsPagerAdapter.this.onDayClickListener.onDayClick(materialCalendarGridView.getAdapter().getItem(i2).longValue());
                }
            }
        });
    }

    @Override // l.AbstractC0414
    public long getItemId(int i) {
        return this.calendarConstraints.getStart().monthsLater(i).getStableId();
    }

    @Override // l.AbstractC0414
    public int getItemCount() {
        return this.calendarConstraints.getMonthSpan();
    }

    public CharSequence getPageTitle(int i) {
        return getPageMonth(i).getLongName();
    }

    public Month getPageMonth(int i) {
        return this.calendarConstraints.getStart().monthsLater(i);
    }

    public int getPosition(Month month) {
        return this.calendarConstraints.getStart().monthsUntil(month);
    }
}
