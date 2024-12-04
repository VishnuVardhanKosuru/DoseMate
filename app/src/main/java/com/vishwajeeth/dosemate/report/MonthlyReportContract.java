package com.vishwajeeth.dosemate.report;

import com.vishwajeeth.dosemate.BasePresenter;
import com.vishwajeeth.dosemate.BaseView;
import com.vishwajeeth.dosemate.data.source.History;

import java.util.List;

/**
 * Created by vishwajeeth on 13/07/17.
 */

public interface MonthlyReportContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showHistoryList(List<History> historyList);

        void showLoadingError();

        void showNoHistory();

        void showTakenFilterLabel();

        void showIgnoredFilterLabel();

        void showAllFilterLabel();

        void showNoTakenHistory();

        void showNoIgnoredHistory();

        boolean isActive();

        void showFilteringPopUpMenu();

    }

    interface Presenter extends BasePresenter {

        void loadHistory(boolean showLoading);

        void setFiltering(FilterType filterType);

        FilterType getFilterType();
    }
}
