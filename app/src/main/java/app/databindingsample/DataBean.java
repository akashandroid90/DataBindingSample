package app.databindingsample;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.annotation.DrawableRes;
import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by akashjain on 06/12/17.
 */

public class DataBean {
    @DrawableRes public int image;

    DataBean(Builder builder) {
        image = builder.image;
    }

    public static class Builder {
        @DrawableRes private int image;
        private Context mContext;

        public Builder(Context context) {
            mContext = context;
        }

        public Builder setNumber(@DrawableRes int image) {
            this.image = image;
            return this;
        }

        public DataBean build() {
            return new DataBean(this);
        }
    }
}
