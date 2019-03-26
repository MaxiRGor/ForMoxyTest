package harelchuk.maxim.quizwithmoxy.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface SetBankView extends MvpView {
    @StateStrategyType(AddToEndSingleStrategy.class)
    void showDebit(boolean is_debit, long time_to_increase,
                   long debit_GD, long debit_AD, long debit_CP, long user_money);
    void showCredit(boolean is_credit, long max_progress, long credit_time_to_return, long[] credit_GAC, long user_money);

    void showAlertMessage(String alertTitle, String alertText);

    void setBrokenButtons(boolean is_debit, boolean is_credit);

}
