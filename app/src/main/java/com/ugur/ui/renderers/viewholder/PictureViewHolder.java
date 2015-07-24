/*
* Copyright (C) 2015 Pedro Paulo de Amorim.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.ugur.ui.renderers.viewholder;

import android.view.View;
import butterknife.ButterKnife;
import com.github.ppamorim.recyclerrenderers.viewholder.RenderViewHolder;
import com.ugur.domain.model.Picture;
import com.ugur.ui.activity.BaseActivity;

public class PictureViewHolder extends RenderViewHolder<Picture> implements View.OnClickListener {

  public PictureViewHolder(View view) {
    super(view);
    view.setOnClickListener(this);
    ButterKnife.bind(this, view);
  }

  @Override public void onBindView(Picture picture) {

  }

  @Override public void onClick(View v) {
    ((BaseActivity) getContext()).show();
  }

}
