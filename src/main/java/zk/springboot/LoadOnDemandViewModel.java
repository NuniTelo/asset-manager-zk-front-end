package zk.springboot;

import org.zkoss.zul.ListModel;

public class LoadOnDemandViewModel {

        private ListModel<String> hugeList = new FakeListModel(250000);

        public ListModel<String> getHugeList() {
            return hugeList;
        }
    }

